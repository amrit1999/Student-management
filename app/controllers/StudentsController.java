package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import consumers.consumerOne;
import consumers.consumerTwo;
import models.Student;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.students.create;
import views.html.students.edit;

import javax.inject.Inject;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;


public class StudentsController extends Controller{

    @Inject
    FormFactory formFactory;
    @Inject
    MessagesApi messagesApi;

    // all students
    public Result index(){
        List<Student> students = Student.find.all();
        return ok(Json.toJson(students));
    }

    // add new student
    public Result create(Http.Request request){
        Form<Student> studentForm = formFactory.form(Student.class);
        return ok(create.render(studentForm,request, messagesApi.preferred(request)));
    }

    // to save student
    public Result save(Http.Request request) throws IOException, TimeoutException {
        Form<Student> studentForm = formFactory.form(Student.class).bindFromRequest(request);
        if(studentForm.hasErrors()) {
            return badRequest(create.render(studentForm,request, messagesApi.preferred(request)));
        }
        Student student = studentForm.get();
        String json = new ObjectMapper().writeValueAsString(student);
        publish(json,"student_insert_queue","student_direct","student.insert");
        consumerOne c = new consumerOne();
        c.consumeMessage();
        return redirect(routes.StudentsController.index());
    }

    // to edit student details
    public Result edit(Integer id,Http.Request request ){
        Student student = Student.find.byId(id);
        if(student==null){
            return notFound("student not found");
        }
        Form<Student> studentForm = formFactory.form(Student.class).fill(student);
        return ok(edit.render(studentForm,student,request, messagesApi.preferred(request)));
    }

    // to update details
    public Result update(Integer id,Http.Request request) throws IOException, TimeoutException {
        Form<Student> studentForm = formFactory.form(Student.class).bindFromRequest(request);
        Student oldstudent = Student.find.byId(id);
        if(studentForm.hasErrors()) {
            return badRequest(edit.render(studentForm,oldstudent,request, messagesApi.preferred(request)));
        }
        Student student = studentForm.get();
        oldstudent.name=student.name;
        oldstudent.marks=student.marks;
        oldstudent.age=student.age;
        oldstudent.branch=student.branch;
        String json = new ObjectMapper().writeValueAsString(oldstudent);
        publish(json,"student_update_queue","student_direct","student.update");
        consumerTwo t = new consumerTwo();
        t.consumeMessage();
        return redirect(routes.StudentsController.index());
    }


    // to delete any particular student
    public Result destroy( Integer id){
        Student student = Student.find.byId(id);
        if(student==null){
            return notFound("Student not found");
        }
        student.delete();
        return redirect(routes.StudentsController.index());
    }

    // for particular student detail
    public Result show(Integer id){
        Student student = Student.find.byId(id);
        if(student==null){
            return notFound("Student not found");
        }
        return ok(Json.toJson(student));
    }

    public void publish( String msg, String q, String exc, String route_key) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.exchangeDeclare(exc, "direct");
            channel.queueDeclare(q, true, false, false, null);
            channel.queueBind(q, exc, route_key);


            System.out.println(msg + " sent ");

            channel.basicPublish(exc, route_key, null, msg.getBytes("UTF-8"));

        }
    }


}

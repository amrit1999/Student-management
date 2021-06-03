package consumers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import models.Student;

import javax.inject.Singleton;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Singleton
public class consumerTwo {

    public void consumeMessage() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setVirtualHost("/");
        factory.setHost("localhost");
        factory.setPort(5672);

        Connection conn = factory.newConnection();
        Channel channel = conn.createChannel();
        channel.exchangeDeclare("student_direct", "direct");
        channel.queueDeclare("student_update_queue", true, false, false, null);
        channel.queueBind("student_update_queue", "student_direct", "student.update");

        channel.basicConsume("student_update_queue", true, (consumerTag, message)-> {
            String m = new String(message.getBody(), "UTF-8");
            System.out.println("i just received a update message = " + m);
            Student s = new ObjectMapper().readValue(m, Student.class);
            s.update();

        },  consumerTag->{});
    }



}

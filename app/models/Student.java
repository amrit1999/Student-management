package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student extends Model{

    @Id
    @GeneratedValue
    public Integer id;

    @Constraints.Required
    public String name;

    @Constraints.Required
    public Integer age;

    @Constraints.Required
    public String branch;

    @Constraints.Required
    public Integer marks;

    public static Finder<Integer,Student> find = new Finder<>(Student.class);
}

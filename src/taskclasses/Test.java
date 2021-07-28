package taskclasses;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private static Object SpbuStudent;

    public static void main (String [] args ){
        List <SpbuStudent> students2course = new ArrayList<SpbuStudent>();

        SpbuTeacher Anna = new SpbuTeacher("Anna", 75, "teacher", "Spbu", "maths", students2course);
        SpbuStudent First = new SpbuStudent("Lev", 20, "student", 2, Anna );
        SpbuStudent Second = new SpbuStudent("Bob", 20, "student", 2, Anna );
        SpbuStudent Third = new SpbuStudent("Liza", 20, "student", 2, Anna );


        students2course.add (First);
        students2course.add (Second);
        students2course.add (Third);

        System.out.println(Anna.getStudent());

    }
}

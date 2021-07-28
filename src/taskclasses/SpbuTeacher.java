package taskclasses;

import java.util.List;

public class SpbuTeacher extends Person implements Teacher {

    String Job;
    String University;
    String CurrentCourse;
    List <SpbuStudent> student;

    public SpbuTeacher(String Name, int Age, String Job, String University,String CurrentCourse, List <SpbuStudent> student){
        this.Name = Name;
        this.Age = Age;
        this.Job = Job;
        this.University = University;
        this.CurrentCourse = CurrentCourse;
        this.student = student;
    }

    @Override
    public String getJob() {
     return Job;
    }

    @Override
    public String getUniversity() {
        return University;
    }

    @Override
    public String getCurrentCourse() {
        return CurrentCourse;
    }

    @Override
    public List<SpbuStudent> getStudent() {
        return student;
    }


}

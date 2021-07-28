package taskclasses;

public class SpbuStudent extends Person implements Student{
    String Job;
    int Grade;
    SpbuTeacher Supervisor;
    public SpbuStudent(String Name, int Age, String Job, int Grade, SpbuTeacher Supervisor){
        this.Name = Name;
        this.Age = Age;
        this.Job = Job;
        this.Grade = Grade;
        this.Supervisor = Supervisor;
    }

    @Override
    public String getJob() {
     return Job;
    }

    @Override
    public int getGrade() {
        return Grade;
    }

    @Override
    public Teacher getSupervisor() {
        return Supervisor;
    }

    @Override
    public String toString()  {
        return Name +" "+ Age;
    }
}

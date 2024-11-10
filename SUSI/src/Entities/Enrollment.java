package Entities;

public class Enrollment {
    private Student student;
    private Course course;
    private int year;
    private int semester;

    public Enrollment(Student student,Course course,int year,int semester)
    {
        this.student=student;
        this.course=course;
        this.year=year;
        this.semester=semester;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getSemester() {
        return semester;
    }
}

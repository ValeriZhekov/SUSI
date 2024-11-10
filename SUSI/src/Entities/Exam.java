package Entities;

public class Exam {
    private Course course;
    private int year;
    private int semester;
    public Exam(Course course,int year,int semester)
    {
        this.course=course;
        this.year=year;
        this.semester=semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Course getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }
}

package Entities;

public class TeachCourse {
    private Teacher teacher;
    private Course course;
    private int year;
    private int semester;
    public TeachCourse(Teacher teacher,Course course,int year,int semester)
    {
        this.teacher=teacher;
        this.course=course;
        this.year=year;
        this.semester=semester;
    }

    public Course getCourse() {
        return course;
    }

    public int getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

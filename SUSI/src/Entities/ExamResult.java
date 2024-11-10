package Entities;

public class ExamResult {
    Exam exam;
    Student student;
    double result;
    ExamResult(Exam exam,Student student,double result)
    {
        this.exam=exam;
        this.student=student;
        this.result=result;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Student getStudent() {
        return student;
    }

    public double getResult() {
        return result;
    }

    public Exam getExam() {
        return exam;
    }
}

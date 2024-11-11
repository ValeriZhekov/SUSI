package Entities;

import java.util.ArrayList;

public class SUSI {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Elective> electives;
    private ArrayList<Core> cores;
    private ArrayList<Exam> exams;
    private ArrayList<ExamResult> examResults;
    private ArrayList<Enrollment> enrollments;
    private ArrayList<TeachCourse> teachCourses;
    public SUSI()
    {
        this.students=new ArrayList<>();
        this.teachers=new ArrayList<>();
        this.electives=new ArrayList<>();
        this.cores=new ArrayList<>();
        this.exams=new ArrayList<>();
        this.examResults=new ArrayList<>();
        this.enrollments=new ArrayList<>();
        this.teachCourses=new ArrayList<>();
    }
    private Teacher courseTeacher(Course course,int year,int semester)
    {
        for (int i=0; i<teachCourses.size(); i++)
        {
          if (teachCourses.get(i).getCourse()==course && teachCourses.get(i).getYear()==year && teachCourses.get(i).getSemester()==semester)
              return teachCourses.get(i).getTeacher();
        }
        return null;
    }
    private Exam findExam(Course course,int year,int semester)
    {
        for (int i=0; i< exams.size(); i++){
            if (exams.get(i).getCourse().equals(course) && exams.get(i).getYear()==year && exams.get(i).getSemester()==semester)
                return exams.get(i);
        }
        return null;
    }
    private Student findStudent(String FN)
    {
        for (int i=0; i< students.size(); i++){
            if (students.get(i).FN.equals(FN))
                return students.get(i);
        }
        return null;
    }
    private Teacher findTeacher(String FN)
    {
        for (int i=0; i< teachers.size(); i++){
            if (teachers.get(i).FN.equals(FN))
                return teachers.get(i);
        }
        return null;
    }
    private Elective findElective(String name)
    {
        for (int i=0; i< electives.size(); i++){
            if (electives.get(i).name.equals(name))
                return electives.get(i);
        }
        return null;
    }
    public void addStudent(String name, String FN, String phoneNum, String dateOfBirth,Master master)
    {
        students.add(new Student(name, FN, phoneNum, dateOfBirth, master));
    }
    public void addTeacher(String name, String FN, String phoneNum, String dateOfBirth, Department department)
    {
        teachers.add(new Teacher(name, FN, phoneNum, dateOfBirth, department));
    }
    public void addElectiveExam(String electiveName,int year,int semester)
    {   Elective elective=findElective(electiveName);
        if (elective==null)
        {
            System.out.println("Invalid elective");
            return;
        }
        exams.add(new Exam(elective, year, semester));
    }
    public void joinElective(String electiveName,String studentFN,int yearJoined)
    {
       Student student=findStudent(studentFN);
        Elective elective=findElective(electiveName);
        if (elective==null || student==null)
        {
            System.out.println("Invalid student or elective");
            return;
        }
        enrollments.add(new Enrollment(student,elective,yearJoined,elective.semester));
    }
   public void addElective(String name,int credits,java.util.ArrayList<Master> masters,int year,int semester,ElectiveType type)
    {
        electives.add(new Elective(name, credits, masters, year, semester, type) );
    }
    public void addCore(String name,int credits,java.util.ArrayList<Master> masters,int year,int semester,Department department)
    {
        cores.add(new Core(name, credits, masters, year, semester, department));
    }
    public void teachElective(String teacherFN,String electiveName,int yearTeached)
    {
        Teacher teacher=findTeacher(teacherFN);
        Elective elective=findElective(electiveName);
        if (teacher==null || elective==null)
        {
            System.out.println("Invalid teacher or elective");
            return;
        }
        teachCourses.add(new TeachCourse(teacher, elective, yearTeached, elective.semester));
    }
    public void addElectiveExamResult(String electiveName,String studentFN,int year,int semester,double result)
    { Elective elective=findElective(electiveName);
        Student student=findStudent(studentFN);
        Exam exam=findExam(elective,year,semester);
    examResults.add(new ExamResult(exam,student,result));
    }
    public void studentInfo(String FN)
    {   StudentConsolePrinter s=new StudentConsolePrinter();
        Student student=findStudent(FN);
        if (student==null)
        {
            System.out.println("No such student");
            return;
        }
        s.print(student);
    }
    public void teacherInfo(String FN)
    {   TeacherConsolePrinter t=new TeacherConsolePrinter();
        Teacher teacher=findTeacher(FN);
        if (teacher==null)
        {
            System.out.println("No such teacher");
            return;
        }
        t.print(teacher);
    }
    public void examResults(String FN,int year,int semester)
    {
        for (int i=0; i<examResults.size(); i++)
        {
            if (examResults.get(i).student.getFN().equals(FN) && examResults.get(i).getExam().getYear()==year && examResults.get(i).getExam().getSemester()==semester)
                System.out.println(examResults.get(i).getExam().getCourse().getName()+" "+courseTeacher(examResults.get(i).getExam().getCourse(),year,semester).getName()+" result: "+examResults.get(i).getResult());
        }
    }

}

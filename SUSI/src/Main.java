import Entities.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        SUSI susi=new SUSI();
        susi.addStudent("Valeri Zhekov","0MI0800015","0898723456","18.06.2002",Master.CS);
        susi.addStudent("Kris Iliev","080015","0897863022","22.05.2001",Master.Maths);
        susi.addStudent("Mitaka Iliev","08MI120015","0897863662","22.05.2002",Master.SE);
        susi.addTeacher("Skeleta","801215","0876464623","12.02.1977",Department.Informatics);
        susi.addTeacher("Bojilov","0MI0600012","0877651234","12.02.1988",Department.Algebra);
        susi.addTeacher("Trifon","0MI0500011","0845651234","12.02.1989",Department.Informatics);
        ArrayList<Master> a=new ArrayList<Master>(Arrays.asList(Master.CS,Master.SE));
        ArrayList<Master> b=new ArrayList<Master>(Arrays.asList(Master.Maths,Master.Informatics));
        ArrayList<Master> c=new ArrayList<Master>(Arrays.asList(Master.CS,Master.Informatics));
        susi.addElective("SDP Praktikum",4,a,2,1,ElectiveType.QKN);
        susi.addElective("Algebra 3",6,b,2,2,ElectiveType.MAT);
        susi.addElective("OOP Praktikum",3,c,1,2,ElectiveType.QKN);
        susi.teachElective("0MI0600012","Algebra 3",2022);
        susi.teachElective("0MI0500011","SDP Praktikum",2022);
        susi.teachElective("0MI0500011","OOP Praktikum",2021);
        susi.joinElective("OOP Praktikum","0MI0800015",2021);
        susi.joinElective("SDP Praktikum","0MI0800015",2022);
        susi.addElectiveExam("OOP Praktikum",2021,2);
        susi.addElectiveExam("SDP Praktikum",2022,1);
        susi.addElectiveExamResult("OOP Praktikum","0MI0800015",2021,2,5.2);
        susi.addElectiveExamResult("SDP Praktikum","0MI0800015",2022,1,5.3);

        java.time.LocalDate x=java.time.LocalDate.now();
        System.out.println(x);
        StudentConsolePrinter s=new StudentConsolePrinter();
        TeacherConsolePrinter t=new TeacherConsolePrinter();

       susi.studentInfo("0MI0800015");
       susi.teacherInfo("801215");
       susi.examResults("0MI0800015",2022,1);
        susi.examResults("0MI0800015",2021,2);
    }
}
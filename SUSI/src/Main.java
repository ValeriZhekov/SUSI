import Entities.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people=new ArrayList<>();
        Student jek=new Student("Valeri Zhekov","0MI0800015","0898723456","18.06.2002",Master.CS);
        Teacher skeleta=new Teacher("Skeleta","801215","0876464623","12.02.1977",Department.Informatics);
        people.add(jek);
        people.add(skeleta);
        java.time.LocalDate x=java.time.LocalDate.now();
        System.out.println(x);
        StudentConsolePrinter s=new StudentConsolePrinter();
        TeacherConsolePrinter t=new TeacherConsolePrinter();
        s.print(jek);
        t.print(skeleta);
        ArrayList<Master> coreMasters=new ArrayList<Master>(Arrays.asList(Master.CS,Master.SE));
        ArrayList<Master> electiveMasters=new ArrayList<Master>(Arrays.asList(Master.Maths,Master.Informatics));
        Core Algebra=new Core("algebra",7,coreMasters,1,1,Department.Algebra);
        Elective mod3d=new Elective("3D Mod",6,electiveMasters,2,1,ElectiveType.QKN);
        CoreConsolePrinter c=new CoreConsolePrinter();
        ElectiveConsolePrinter e=new ElectiveConsolePrinter();
        c.print(Algebra);
        e.print(mod3d);
        ArrayList<Enrollment> enrolls=new ArrayList<>();
        ArrayList<TeachCourse> teaches=new ArrayList<>();
        enrolls.add(new Enrollment(jek,Algebra,2021,1));
        teaches.add(new TeachCourse(skeleta,Algebra,2021,1));
    }
}
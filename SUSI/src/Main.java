import Entities.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people=new ArrayList<>();
        people.add(new Student("Valeri Zhekov","0MI0800015","0898723456","18.06.2002",Master.CS));
        people.add(new Teacher("Skeleta","801215","0876464623","12.02.1977",Department.Informatics));
        java.time.LocalDate x=java.time.LocalDate.now();
        System.out.println(x);
        StudentConsolePrinter s=new StudentConsolePrinter();
        TeacherConsolePrinter t=new TeacherConsolePrinter();
        s.print((Student)people.getFirst());
        t.print((Teacher)people.get(1));
    }
}
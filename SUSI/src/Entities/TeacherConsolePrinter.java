package Entities;

public class TeacherConsolePrinter {
    public void print(Teacher teacher) {
        System.out.println("Name:"+teacher.getName()+" FN:"+teacher.getFN()+" PhoneNum:"+teacher.getPhoneNum()
                +" Brith:"+teacher.getDateOfBirth()+" Department:"+teacher.getDepartment());
    }
}

package Entities;

public class TeacherPrinter {
    public void printToConsole(Teacher teacher) {
        System.out.println("Name:"+teacher.getName()+" FN:"+teacher.getFN()+" PhoneNum:"+teacher.getPhoneNum()
                +" Brith:"+teacher.getDateOfBirth()+" Department:"+teacher.getDepartment());
    }
    public void printToFile(Teacher teacher) {
        //not ready
    }
}

package Entities;

public class StudentPrinter {

    public void printToConsole(Student student)
    {
    System.out.println("Name:"+student.getName()+" FN:"+student.getFN()+" PhoneNum:"+student.getPhoneNum()
            +" Brith:"+student.getDateOfBirth()+" Master:"+student.getMaster());
    }
    public void printToFile(Student student) {
        //not ready
    }
}

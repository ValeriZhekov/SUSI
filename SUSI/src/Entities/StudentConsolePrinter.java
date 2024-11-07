package Entities;

public class StudentConsolePrinter {
        public void print(Student student) {
            System.out.println("Name:"+student.getName()+" FN:"+student.getFN()+" PhoneNum:"+student.getPhoneNum()
                    +" Birth:"+student.getDateOfBirth()+" Master:"+student.getMaster());
        }
}

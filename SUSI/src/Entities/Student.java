package Entities;

public class Student extends Person {
    private Master master;
    public Student(String name, String FN, String phoneNum, String dateOfBirth,Master master)
    {
        super(name,FN,phoneNum,dateOfBirth);
        this.master=master;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }
}

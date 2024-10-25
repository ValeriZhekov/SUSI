package Entities;

public class Teacher extends Person {
    private Department department;
    public Teacher(String name, String FN, String phoneNum, String dateOfBirth, Department department)
    {
        super(name,FN,phoneNum,dateOfBirth);
        this.department=department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

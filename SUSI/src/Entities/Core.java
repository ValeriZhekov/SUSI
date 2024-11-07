package Entities;

public class Core extends Course{
    private Department department;
    public Core(String name,int credits,java.util.ArrayList<Master> masters,int year,int semester,Department department)
    {
        super(name,credits,masters,year,semester);
        this.department=department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}

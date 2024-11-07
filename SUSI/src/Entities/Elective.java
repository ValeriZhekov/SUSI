package Entities;

public class Elective extends Course{
    private ElectiveType type;
    public Elective(String name,int credits,java.util.ArrayList<Master> masters,int year,int semester,ElectiveType type)
    {
        super(name,credits,masters,year,semester);
        this.type=type;
    }

    public ElectiveType getType() {
        return type;
    }

    public void setType(ElectiveType type) {
        this.type = type;
    }
}

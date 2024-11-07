package Entities;

import java.util.ArrayList;

public abstract class Course {
    protected String name;
    protected int credits;
    protected java.util.ArrayList<Master> masters;
    protected int year;
    protected int semester;

    public Course(String name,int credits,java.util.ArrayList<Master> masters,int year,int semester)
    {
        this.name=name;
        this.credits=credits;
        this.masters=masters;
        this.year=year;
        this.semester=semester;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public java.util.ArrayList<Master> getMasters() {
        return masters;
    }

    public void setMasters(java.util.ArrayList<Master> masters) {
        this.masters = masters;
    }
}

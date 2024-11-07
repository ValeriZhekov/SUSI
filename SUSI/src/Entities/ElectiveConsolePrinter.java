package Entities;

import java.util.ArrayList;

public class ElectiveConsolePrinter {
    public void print(Elective elective)
    {
        System.out.println("Name: "+elective.getName()+" Credits: "+elective.getCredits()+" Year/Semester: "+elective.getYear()+"/"+elective.getSemester()+" Type: "+elective.getType());
        ArrayList<Master> masters=elective.getMasters();
        for (int i=0; i< masters.size(); i++)
            System.out.print(masters.get(i)+" ");
        System.out.println();
    }
}

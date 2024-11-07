package Entities;

import java.util.ArrayList;

public class CoreConsolePrinter {
    public void print(Core core)
    {
        System.out.println("Name: "+core.getName()+" Credits: "+core.getCredits()+" Year/Semester: "+core.getYear()+"/"+core.getSemester()+" Department: "+core.getDepartment());
        ArrayList<Master> masters=core.getMasters();
        for (int i=0; i< masters.size(); i++)
            System.out.print(masters.get(i)+" ");
        System.out.println();
    }
}

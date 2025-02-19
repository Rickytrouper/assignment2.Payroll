//Abbligale Reid - ID#2301010638
//Kwame Harriott - ID#2301011566
//Shemoy Shay    - ID#2201011505
//Ricardo Wright - ID#2201010833

import java.util.ArrayList;

public class Payroll {
    public static void main(String[] args) {

        // Instantiate a SalesRep staffMember object
        System.out.println("One Instance of a SalesRep staff Member ");
        SalesRep salesRep = new SalesRep("Ricardo", "Smith", "Acct1", 40, 500);

        // Invoke the display method to print a SalesRep StaffMember data values
        salesRep.display();

        System.out.println();
        System.out.println("Printing Array String of SalesRep Staff Members");

        ArrayList<SalesRep> salesReps = new ArrayList<>();
        salesReps.add(new SalesRep("Jessia","Miller","1002",45, 5620));
        salesReps.add(new SalesRep("Calvin","Street","1052",95, 6620));
        salesReps.add(new SalesRep("Kwamie","Clarke","1006",65, 9620));
        salesReps.add(new SalesRep("Nicki","Bell",   "1006",75, 6620));
        salesReps.add(new SalesRep("Hector","Douglas","1002",75, 5620));
        salesReps.add(new SalesRep("Jessie","Mills","1056",95, 5620));

        for (SalesRep rep: salesReps) {
            System.out.println("*****************************");
            rep.display();

       }
        //Demonstrating Polymorphism
        StaffMember manager = new Manager(7, "Adrian Brown", 57, 2000);
        StaffMember SalesRep = new SalesRep(8, "James Roberts", 36, 1200);

        System.out.println();
        System.out.println("Polymorphism Demonstration:");
        manager.display();
        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println();
        salesRep.display();
        System.out.println("SalesRep Salary: " + salesRep.calculateSalary());
        System.out.println();
    }


}
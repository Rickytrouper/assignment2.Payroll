//Abbligale Reid - ID#2301010638
//Kwame Harriott - ID#2301011566
//Shemoy Shay    - ID#2201011505
//Ricardo Wright - ID#2201010833

import java.io.FileWriter;
import java.io.IOException;
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
        StaffMember manager = new Manager("Adrian", "Brown", "2009", 57, 2000);
        StaffMember salesRep2 = new SalesRep("James", "Roberts", "2001",36, 1200);

        System.out.println();
        System.out.println("Polymorphism Demonstration:");
        manager.display();
        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println();
        salesRep.display();
        System.out.println("SalesRep Salary: " + salesRep.calculateSalary());
        System.out.println();


        // Store employees in a list
        ArrayList<StaffMember> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(salesRep);
        employees.add(salesRep2);
        employees.addAll(salesReps);

        // Display salaries and generate paystub
        generatePaystub(employees);
    }
    public static void generatePaystub(ArrayList<StaffMember> employees) {
        try (FileWriter writer = new FileWriter("paystub.txt")) {
            for (StaffMember employee : employees) {
                if (employee == null) continue;

                System.out.println("*****************************");
                //employee.display();
                double salary = employee.calculateSalary();
                //System.out.println("Salary: " + salary);
                System.out.println();

                // Write to paystub file
                System.out.printf("Employee: " + employee.getFirstName() + " " + employee.getLastName() + "\n");
                System.out.printf("Department: " + employee.getDeptNumber() + "\n");
                System.out.printf("Hours Worked: " + employee.getHoursWorked() + "\n");
                System.out.printf("Salary: " + salary + "\n");
                System.out.printf("--------------------------\n");
            }
            System.out.println("Paystub generated successfully!");
        } catch (IOException e) {
            System.out.println("Error writing paystub file: " + e.getMessage());
        }
    }
}






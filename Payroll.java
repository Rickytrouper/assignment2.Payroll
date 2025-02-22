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
            System.out.println("Salary: $" + rep.calculateSalary());

       }


        // Instantiate a Manager staff member
        System.out.println("\nOne Instance of a Manager:");
        Manager manager = new Manager("Sophia", "Clark", "2010", 50, 2500);
        manager.display();
        //System.out.println("Manager Salary: $" + manager.calculateSalary());


        //Demonstrating Polymorphism
        StaffMember manager2 = new Manager("Adrian", "Brown", "2009", 57, 2000);
        StaffMember salesRep2 = new SalesRep("James", "Roberts", "2001",36, 1200);



        System.out.println();
        System.out.println("Polymorphism Demonstration:");
        manager2.display();
        System.out.println("Manager Salary: " + manager2.calculateSalary());
        System.out.println();
        salesRep2.display();
        System.out.println("SalesRep Salary: $" + salesRep2.calculateSalary());

        System.out.println();
        salesRep.display();
        System.out.println("SalesRep Salary: " + salesRep.calculateSalary());
        System.out.println();


        // Store employees in a list
        ArrayList<StaffMember> employees = new ArrayList<>();
        employees.add(manager2);
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

                writer.write("*****************************");
                //employee.display();
                double salary = employee.calculateSalary();
                //System.out.println("Salary: " + salary);
                System.out.println();

                // Write to paystub file
                writer.write("Employee: " + employee.getFirstName() + " " + employee.getLastName() + "\n");
                writer.write("Department: " + employee.getDeptNumber() + "\n");
                writer.write("Hours Worked: " + employee.getHoursWorked() + "\n");
                writer.write("Salary: " + salary + "\n");
                writer.write("--------------------------\n");
            }
            System.out.println("Paystub generated successfully!");
        } catch (IOException e) {
            System.out.println("Error writing paystub file: " + e.getMessage());
        }
    }
}






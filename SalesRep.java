//Abbligale Ried - ID#2301010638
//Kwame Harriott - ID#2301011566
//Shemoy Shay -  ID#2201011505
//Ricardo Wright - ID#2201010833v

public class SalesRep extends StaffMember {
    private double allowance; // Declare Sales Rep Allowance

    // Default constructor
    public SalesRep() {
        super(); // default constructor of StaffMember
        this.allowance = 0.0; // Default allowance
    }

    // Parameterized constructor
    public SalesRep(String firstName, String lastName, String deptNumber, double hoursWorked, double allowance) {
        super(firstName, lastName, deptNumber, hoursWorked); // Call superclass constructor from teh parent class staffMember
        this.allowance = allowance;    }

    // Getter and Setter for allowance
    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    // Overriding display method to include allowance
    @Override
    public void display() {
        super.display(); // Call the display method from the superclass display
        System.out.println("Allowance: " + allowance); // Display of the allowance
    }




}
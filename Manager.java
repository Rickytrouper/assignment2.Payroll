//Abbligale Ried - ID#2301010638
//Kwame Harriott - ID#2301011566
//Shemoy Shay -  ID#2201011505
//Ricardo Wright - ID#2201010833

public class Manager extends StaffMember {
    private double bonus; //Declare Manager Bonus

    // Default constructor
    public Manager() {
        super(); // default constructor of StaffMember
        this.bonus = 0.0; // Default bonus
    }

    // Parameterized constructor
    public Manager(String firstName, String lastName, String deptNumber, double hoursWorked, double bonus) {
        super(firstName, lastName, deptNumber, hoursWorked);
        this.bonus = bonus;
    }

    // Getter and Setter for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Overriding display method to include bonus
    @Override
    public void display() {
        super.display(); // Call the display method from the superclass display
        System.out.println("Bonus: " + bonus); // Display the of the bonus
    }



}
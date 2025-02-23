//Abbligale Ried - ID#2301010638
//Kwame Harriott - ID#2301011566
//Shemoy Shay -  ID#2201011505
//Ricardo Wright - ID#2201010833

abstract class StaffMember {
    protected String firstName;  // Protected field
    protected String lastName;   // Protected field
    protected String deptNumber; // Protected field
    protected double hoursWorked; // Protected field

    // Default constructor
    protected StaffMember()  {
        this("", "", "", 0.0);
    }

    // Parameterized constructor
    protected StaffMember(String firstName, String lastName, String deptNumber, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for deptNumber
    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    // Getter and Setter for hoursWorked
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    // Public display method
    public void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Department Number: " + deptNumber);
        System.out.println("Hours Worked: " + hoursWorked);
    }

    // Implement calculateSalary method
    public abstract double calculateSalary();
}
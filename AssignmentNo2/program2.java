// program2.java
class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public double getMonthlySalary() { return monthlySalary; }
    public void setMonthlySalary(double monthlySalary) { 
        if (monthlySalary > 0) 
            this.monthlySalary = monthlySalary; 
    }

    public double getYearlySalary() { return monthlySalary * 12; }

    public void giveRaise(double percent) {
        if (percent > 0)
            this.monthlySalary += this.monthlySalary * percent / 100;
    }
}

public class program2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 30000);
        Employee emp2 = new Employee("Jane", "Smith", 40000);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                " Yearly Salary: " + emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nAfter 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                " Yearly Salary: " + emp2.getYearlySalary());
    }
}

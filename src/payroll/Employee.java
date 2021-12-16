package payroll;

public class Employee {
    private String name;
    private String lastName;
    private int salary;

    public Employee(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Salary for " + name + " " + lastName + " is " + salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
}

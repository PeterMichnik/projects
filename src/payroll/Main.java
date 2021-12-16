package payroll;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> listWorkers = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            listWorkers.add(getEmployeeFromUser());
        }
        System.out.println(listWorkers);
    }

    private static Employee getEmployeeFromUser() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.next();

        System.out.print("Enter a last name: ");
        String lastName = sc.next();

        System.out.print("Enter a salary: ");
        int salary = sc.nextInt();

        return new Employee(name, lastName, salary);
    }
}

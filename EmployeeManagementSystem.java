import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Employee class with id, name, and salary attributes
class Employee {
    // Attributes
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: Rs" + salary);
        System.out.println("-----------------------------");
    }

    // Getters for the attributes (optional)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a list to store Employee objects
        List<Employee> employees = new ArrayList<>();

        // Get the number of employees from the user
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Loop to get the details of each employee
        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Enter details for Employee " + i);

            // Get employee details from the user
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            // Create a new Employee object and add it to the list
            Employee emp = new Employee(id, name, salary);
            employees.add(emp);

            System.out.println();
        }

        // Display details of all employees
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        // Close the scanner
        scanner.close();
    }
}

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    protected double salary;

    // Default constructor
    Employee() {
        id = 0;
        name = "";
        department = "";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Accept method
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    // Default constructor
    Manager() {
        super();
        bonus = 0.0;
    }

    // Accept method (override)
    public void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    // Display method (override)
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + getTotalSalary());
    }

    // Method to calculate total salary
    public double getTotalSalary() {
        return salary + bonus;
    }
}

public class A14Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of managers: ");
        int n = sc.nextInt();

        Manager[] m = new Manager[n];

        // Accept data
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Manager " + (i + 1));
            m[i] = new Manager();
            m[i].accept();
        }

        // Find manager with max total salary
        double max = m[0].getTotalSalary();
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (m[i].getTotalSalary() > max) {
                max = m[i].getTotalSalary();
                index = i;
            }
        }

        // Display result
        System.out.println("\nManager with Maximum Total Salary:");
        m[index].display();
    }
}
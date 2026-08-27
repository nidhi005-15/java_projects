package day_6;

import java.util.*;

class Employee {
    String name;
    int age;
    String designation;
    double salary;

    Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}

public class assingment_day_6 {
    static Map<String, Employee> employees = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n 1.Create  2. Display  3. Raise salary  4. Exit");
            System.out.print("enter your choice:");

            int choice;
            // ---- Choice validation (no crash on non-numeric entry) ----
            while (!sc.hasNextInt()) {
                System.out.println("Invalid choice! Enter a number.");
                sc.next(); // discard bad token
                System.out.print("enter your choice:");
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    raiseSalary();
                    break;
                case 4:
                    System.out.println("EXIT");
                    sc.close();
                    return;
                default:
                    System.out.println("Enter valid choice:");
                    break;
            }
        }
    }

    static void create() {
        char ch;
        do {
            String name;
            int age;
            String desgn;
            double salary;

            // ---- Name validation ----
            int spaceCount;
            do {
                System.out.print("Enter your name:");
                name = sc.nextLine();

                spaceCount = 0;
                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) == ' ') {
                        spaceCount++;
                    }
                }

                if (spaceCount > 2) {
                    System.out.println("Invalid name! More than 2 spaces are not allowed. Enter correctly.");
                } else if (employees.containsKey(name)) {
                    System.out.println("Employee with this name already exists! Enter a different name.");
                    spaceCount = 99; // force re-loop
                }
            } while (spaceCount > 2);
            System.out.println("Valid name: " + name);

            // ---- Age validation ----
            do {
                System.out.print("Enter your age:");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid age! Enter a number.");
                    sc.next();
                    System.out.print("Enter your age:");
                }
                age = sc.nextInt();
                sc.nextLine();

                if (age < 18 || age > 60) {
                    System.out.println("Invalid age! Age must be between 18 and 60. Enter correctly.");
                }
            } while (age < 18 || age > 60);
            System.out.println("Valid age: " + age);

            // ---- Designation validation ----
            do {
                System.out.print("Enter your designation(Programmer or Manager or Tester):");
                desgn = sc.nextLine();

                if (!(desgn.equalsIgnoreCase("Programmer") ||
                      desgn.equalsIgnoreCase("Manager") ||
                      desgn.equalsIgnoreCase("Tester"))) {
                    System.out.println("Invalid designation! Enter Programmer, Manager or Tester correctly.");
                }
            } while (!(desgn.equalsIgnoreCase("Programmer") ||
                       desgn.equalsIgnoreCase("Manager") ||
                       desgn.equalsIgnoreCase("Tester")));

            // ---- Assign fixed salary based on designation ----
            if (desgn.equalsIgnoreCase("Programmer")) {
                salary = 20000;
            } else if (desgn.equalsIgnoreCase("Manager")) {
                salary = 25000;
            } else {
                salary = 15000;
            }

            Employee emp = new Employee(name, age, desgn, salary);
            employees.put(name, emp);

            System.out.println("Employee created successfully!");

            System.out.println("Proceed adding extra?(y/n)");
            ch = sc.nextLine().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    static void display() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        for (Employee emp : employees.values()) {
            System.out.println("-----------------------------");
            System.out.println("name:" + emp.name);
            System.out.println("age:" + emp.age);
            System.out.println("designation:" + emp.designation);
            System.out.println("salary:" + emp.salary);
        }
        System.out.println("-----------------------------");
    }

    static void raiseSalary() {
        if (employees.isEmpty()) {
            System.out.println("No employees available. Create one first.");
            return;
        }

        Employee emp = null;
        // ---- Name validation: keep asking till a real employee is entered ----
        while (emp == null) {
            System.out.print("Enter the name of the employee:");
            String name = sc.nextLine();
            emp = employees.get(name);
            if (emp == null) {
                System.out.println("No employee found with that name. Enter correctly.");
            }
        }

        double percent = -1;
        // ---- Percentage validation: 1-10 only ----
        while (percent < 1 || percent > 10) {
            System.out.print("Enter percentage increase (1-10):");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input! Enter a number between 1 and 10.");
                sc.next();
                System.out.print("Enter percentage increase (1-10):");
            }
            percent = sc.nextDouble();
            sc.nextLine();

            if (percent < 1 || percent > 10) {
                System.out.println("Invalid percentage! Must be between 1 and 10. Enter correctly.");
            }
        }

        emp.salary = emp.salary + (emp.salary * percent / 100);
        System.out.println("Salary updated successfully!");
        System.out.println("New salary for " + emp.name + ": " + emp.salary);
    }
}

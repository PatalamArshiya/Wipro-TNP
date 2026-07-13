package IOStreams.MiniProject;

import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        EmployeeOperations eo = new EmployeeOperations();

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Employee Salary: ");
                double salary = sc.nextDouble();

                Employee e = new Employee(id, name, age, salary);

                eo.addEmployee(e);
                break;

            case 2:
                eo.displayAll();
                break;

            case 3:
                System.out.println("Exiting the System");
                System.exit(0);
            sc.close();
            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
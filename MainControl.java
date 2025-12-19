package HashMapProjects.EmployeeManagementSystem;

import java.util.Scanner;

public class MainControl {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        ManageEmployees manageEmployees;
        manageEmployees = new ManageEmployees();

        System.out.println("====Employee Management System====");
        System.out.println("1 -> Add Employees");
        System.out.println("2 -> Display Employees");
        System.out.println("3 -> Display Specific Employee Type");
        System.out.println("4 -> Display In Table Form");
        System.out.println("5 -> Salary Greater Than");
        System.out.println("6 -> Remove Employees");
        System.out.println("7 -> Exit...");

//        System.gc();

        boolean start = true;

        while (start){

            System.out.print("Enter Your Option: ");
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption){

                case 1 -> {

                    System.out.print("Enter The Type: ");
                    String employeeType = scanner.nextLine();
                    manageEmployees.addEmployees(employeeType);

                }
                case 2 -> {
                    manageEmployees.displayEmployeeDetails();
                }
                case 3 -> {
                    System.out.print("Enter The Type: ");
                    String employeeType = scanner.nextLine();

                    manageEmployees.displaySpecificEmployeeTypeDetails(employeeType);
                }
                case 4 -> {
                    System.out.print("Enter The Type: ");
                    String employeeType = scanner.nextLine();

                    manageEmployees.displayTableFormDetails(employeeType);
                }
                case 5 -> {
                    System.out.print("Enter The Type: ");
                    String employeeType = scanner.nextLine();

                    System.out.print("Enter The Employee Salary to filter: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();

                    manageEmployees.employeeGreaterThanSalary(employeeType, salary);
                }
                case 6 -> {
                    System.out.print("Enter The Employee Id: ");
                    String employeeId = scanner.nextLine();

                    manageEmployees.removeEmployeeById(employeeId);

                }
                case 7 -> {
                    start = false;
                }
            }
        }
    }
}

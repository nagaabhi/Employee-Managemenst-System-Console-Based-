package HashMapProjects.EmployeeManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ManageEmployees implements ManagementFeatures {

    HashMap<String, Employee> manageEmployees;
    Scanner scanner;
    Employee employee;

    ManageEmployees(){
        manageEmployees = new HashMap<>();
        scanner = new Scanner(System.in);

    }

    public Set<Map.Entry<String,Employee>> employees(){
        return manageEmployees.entrySet();
    }

    public boolean checkEmployeeStatus(){
        return manageEmployees.isEmpty();
    }

    public void displayErrorMessage(){
        System.out.println("Details For Employee Are Empty...");
    }

    public void displayEmployeeDetails(Map.Entry<String, Employee> employee){


        System.out.println("Employee Id: " + employee.getValue().getEmployeeId());
        System.out.println("Employee Name: " + employee.getValue().getEmployeeName());
        System.out.println("Employee Type: " + employee.getValue().getEmployeeType());
        System.out.println("Employee Salary: " + employee.getValue().calculateSalary());
        line();



    }

    public void tableForm(Map.Entry<String, Employee> employee){

        System.out.println(
                employee.getValue().getEmployeeName() + " : " +
                employee.getValue().calculateSalary());
    }
    public void line(){
        System.out.println(" ---- ");
    }


    @Override
    public void addEmployees(String type) {

        System.out.print("Enter The Employee Id: ");
        String employeeId = scanner.nextLine();
//        if(Employee.countEmployees > 1){
//            scanner.nextLine();
//        }

        System.out.print("Enter The Employee Name: ");
        String employeeName = scanner.nextLine();

        switch (type){

            case "FullTime", "fulltime", "Fulltime" -> {
                System.out.print("Enter The Salary:" );
                double salary = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter The Bonus Salary: ");
                double bonusSalary = scanner.nextDouble();
                scanner.nextLine();


                employee = new FullTimeEmployee(employeeId, employeeName,type, salary, bonusSalary);
                manageEmployees.put(employeeId, employee);

                System.out.println("Full Time Salary: " + employee.calculateSalary());
                line();

            }

            case "parttime", "PartTime", "Parttime" -> {
                System.out.print("Enter The Hours Worked: ");
                double hoursWorked = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter The Rate Per Hour: ");
                double ratePerHour = scanner.nextDouble();
                scanner.nextLine();

                employee = new PartTimeEmployee(employeeId, employeeName,type, hoursWorked, ratePerHour);
                manageEmployees.put(employeeId, employee);

                System.out.println("Part Time Salary: " + employee.calculateSalary());
                line();
            }

            case "contract", "Contract" -> {
                System.out.print("Enter The Contract Salary: ");
                double contractSalary = scanner.nextDouble();
                scanner.nextLine();

                employee = new ContractEmployee(employeeId, employeeName, type, contractSalary);
                manageEmployees.put(employeeId, employee);
                System.out.println("Contract Salary: " + employee.calculateSalary());
                line();
            }
            case "" -> {
                return;
            }
        }
    }

    @Override
    public void displayEmployeeDetails() {

        if(checkEmployeeStatus()){
            displayErrorMessage();
        }
        employees().forEach(this::displayEmployeeDetails);

    }

    @Override
    public void displaySpecificEmployeeTypeDetails(String type) {

        if(checkEmployeeStatus()){
            displayErrorMessage();
        }

        employees().forEach((employee) -> {
            if(employee.getValue().getEmployeeType().equals(type)){
                displayEmployeeDetails(employee);
            }
        });

    }

    public void displayTableFormDetails(String type) {

        if (checkEmployeeStatus()) {
            displayErrorMessage();
        }

        System.out.println("Employee name : Employee Salary");
        employees().forEach((employee) -> {
            if (employee.getValue().getEmployeeType().equals(type)) {
                tableForm(employee);
            }
        });
    }

    public void employeeGreaterThanSalary(String empType, double empSalary){
        if(checkEmployeeStatus()){
            displayErrorMessage();
        }
        employees().forEach((employee) -> {
            boolean getEmpDetails = employee.getValue().getEmployeeType().equals(empType) && employee.getValue().calculateSalary() > empSalary;
            if(getEmpDetails){
                displayEmployeeDetails(employee);
            }

        });

    }

    public void removeEmployeeById(String empId){

        if(checkEmployeeStatus()){
            displayErrorMessage();
        }
        manageEmployees.remove(empId);
        displayEmployeeDetails();

    }
}

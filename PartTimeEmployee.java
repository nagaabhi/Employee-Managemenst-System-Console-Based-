package HashMapProjects.EmployeeManagementSystem;

public class PartTimeEmployee extends Employee {

    private double hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(String employeeId, String employeeName,String employeeType, double hoursWorked, double ratePerHour) {
        super(employeeId, employeeName, employeeType);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

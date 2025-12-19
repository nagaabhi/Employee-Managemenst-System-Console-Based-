package HashMapProjects.EmployeeManagementSystem;

public class FullTimeEmployee extends Employee {

    private double monthlySalary;
    private double bonusSalary;




    public FullTimeEmployee(String employeeId, String employeeName, String employeeType, double monthlySalary, double bonusSalary) {
        super(employeeId, employeeName, employeeType);
        this.monthlySalary = monthlySalary;
        this.bonusSalary = bonusSalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary + bonusSalary;
    }
}

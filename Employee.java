package HashMapProjects.EmployeeManagementSystem;

public abstract class Employee {

    private String employeeId;
    private String employeeName;
    private String employeeType;
    static int countEmployees;


    public Employee(String employeeId, String employeeName, String employeeType) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeType = employeeType;
        Employee.countEmployees += 1;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    abstract double calculateSalary();
}

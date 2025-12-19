package HashMapProjects.EmployeeManagementSystem;
public class ContractEmployee extends  Employee {

    private  double contractSalary;

    public ContractEmployee(String employeeId, String employeeName, String employeeType, double contractSalary) {

        super(employeeId, employeeName, employeeType);
        this.contractSalary = contractSalary;

    }


    @Override
    double calculateSalary() {
        return contractSalary;
    }
}

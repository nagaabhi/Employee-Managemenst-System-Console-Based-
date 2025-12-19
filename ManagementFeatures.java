package HashMapProjects.EmployeeManagementSystem;

public interface ManagementFeatures {

    void addEmployees(String type);
    void displayEmployeeDetails();
    void displaySpecificEmployeeTypeDetails(String type);
    void displayTableFormDetails(String type);
    void employeeGreaterThanSalary(String empType, double empSalary);
    void removeEmployeeById(String empId);

}

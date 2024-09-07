package Abstract_design_Pattern;

public class EmployeeFactory {
    //get Employee
    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();

    }
}

package Abstract_design_Pattern;

public class Client {
    public static void main(String[] args) {
        //want android developer
        Employee e1=EmployeeFactory.getEmployee(new AndroidDevFactory());
                e1.name();

        Employee e2=EmployeeFactory.getEmployee(new WebDevFactory());
        e2.name();
    }
}

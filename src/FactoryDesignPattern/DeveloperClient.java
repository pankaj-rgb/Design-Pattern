package FactoryDesignPattern;

public class DeveloperClient {
    public static void main(String[] args) {

//        Employee employee=new AndroidDeveloper();
        //the above one is tightly coupled as we are creating not based on the input rather client are the ones defining so we would create another class
        //having methods of factory desgin pattern to create the ovbject as of type required EmployeeFactor.java class

        Employee employee=EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee.salary());

        Employee employee2=EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee2.salary());

    }
}

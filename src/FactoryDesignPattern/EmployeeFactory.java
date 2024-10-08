package FactoryDesignPattern;

public class EmployeeFactory {

    //get employee and return the object of that type
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        }
        return null;
    }
}

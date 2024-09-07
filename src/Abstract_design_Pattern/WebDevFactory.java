package Abstract_design_Pattern;

public class WebDevFactory  extends  EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}

package Abstract_design_Pattern;

public class WebDeveloper implements  Employee{
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name() {
        System.out.println(" i am web developer");
        return "WEB DEVELOPER";
    }
}

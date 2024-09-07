package Abstract_design_Pattern;



public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println(" i am android developer");
        return "ANDROID DEVELOPER";

    }


}

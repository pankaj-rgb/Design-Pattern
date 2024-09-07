public class Jalebi {
    //eager way of creating singleton objects
    private static Jalebi jalebi=new Jalebi();
    public static Jalebi getJalebi(){
        return jalebi;
    }
}

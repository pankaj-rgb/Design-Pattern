import java.io.*;
import java.lang.reflect.Constructor;

public class Example implements  Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException ,Exception,CloneNotSupportedException{
//        Samosa samosa1=Samosa.getSamosa();
//        System.out.println(samosa1.hashCode());
//        Samosa samosa2=Samosa.getSamosa();
//        System.out.println(samosa2.hashCode());
//        System.out.println(Jalebi.getJalebi().hashCode());
//        System.out.println(Jalebi.getJalebi().hashCode());

        /*
        how to break singleton pattern
        1. Reflection API
        2. use enum
        3. also could break the pattern by serialization and deserialization
        to resolve the issues of Deserilazation we could use the override read resolve method
        4. clonnig method to get new object
         */
//        Samosa s1=Samosa.getSamosa();
       /* Samosa s1=Samosa.INSTANCE;
        System.out.println(s1.hashCode());
        s1.test();

        try {
            Constructor[] constructors = Samosa.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                Samosa s2= (Samosa) constructor.newInstance();
                System.out.println(s2.hashCode());
                break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        */

    Samosa samosa=Samosa.getSamosa();
    System.out.println(samosa.hashCode());
//    ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
//    oos.writeObject(samosa);
//
//    System.out.println("serialization done");
//    ObjectInputStream ois=new ObjectInputStream((new FileInputStream("abc.ob")));
//    Samosa s2= (Samosa) ois.readObject();
//    System.out.println(s2.hashCode());

        Samosa s2=(Samosa) samosa.clone();
        System.out.println(s2.hashCode());


}



    }


import java.io.Serializable;

//make the class as enum to rmeove singleton issues
//public class Samosa
public class Samosa implements Serializable, Cloneable {

    public static Samosa samosa;
    private Samosa(){
//        if(samosa!=null)
//            throw new RuntimeException("you are trying to break singleton pattern");
    }
    //calling in Example class and preventing from creating multiple class instances
    public  static Samosa getSamosa(){  //lazy initialization, create only when required by client
        if(samosa==null){
            //we could call the synchronized at the methods level but it will make the other function stop while we need
            //only for the below methods
            synchronized (Samosa.class){
            if(samosa==null){samosa=new Samosa();}
            }
            }
        return samosa;
    }


    public Object readResolvc(){
        return samosa;
    }

    @Override
    public Samosa clone() throws CloneNotSupportedException{
//        return (Samosa) super.clone();
        // to prevent the clonneable is just return the following instance
        return samosa;
    }



}
/*
1.constructor private
2.object create with help of method
3. create field to store object is private : not able to access outside

 */
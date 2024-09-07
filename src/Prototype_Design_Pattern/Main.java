package Prototype_Design_Pattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("creting object using prototype design pattern");
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("192.168.0.1");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);


        // we want new objects of network connection
        NetworkConnection networkConnection1=null;
        NetworkConnection networkConnection2=null;
        try {
            networkConnection1=(NetworkConnection) networkConnection.clone();

            networkConnection.getDomains().remove(0);
            System.out.println(networkConnection);
            System.out.println(networkConnection1);
            networkConnection2=(NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}

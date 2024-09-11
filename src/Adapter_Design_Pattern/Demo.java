package Adapter_Design_Pattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println("program started");
        AppleCharger charger=new ChragerXYZ();
        Iphone13 iphone13=new Iphone13(charger);
        iphone13.chargeIphone();

        //charger avaialble is of android and phone is iphone we might need the adapter class to implement the following
        AppleCharger charger1=new AdapterCharger(new DKCharger());
        Iphone13 iphone13plus=new Iphone13(charger1);
        iphone13plus.chargeIphone();

    }
}

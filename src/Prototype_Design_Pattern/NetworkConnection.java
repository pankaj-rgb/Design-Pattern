package Prototype_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;

    private List<String> domains=new ArrayList<>();

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public List<String> getDomains() {
        return domains;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData="very very important Data";
        domains.add("www.google.com");
        domains.add("www.leetcode.com");
        domains.add("myspace.com");
        Thread.sleep(5000);
        //took 5 min
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                " : "+this.domains+
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //logic for cloning
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());
        for(String d:this.getDomains()){
            //this list will have the new list of domains since we are creating new obejct
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }
}

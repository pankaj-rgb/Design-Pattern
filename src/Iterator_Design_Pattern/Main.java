package Iterator_Design_Pattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        UserManagement userManagement=new UserManagement();
        userManagement.addUser(new User("pankaj","142"));
        userManagement.addUser(new User("pankaj1","143"));
        userManagement.addUser(new User("pankaj2","144"));
        userManagement.addUser(new User("pankaj3","145"));

        MyIterator myIterator=userManagement.getIterator();
        while(myIterator.hasNext()){
            User user=(User)myIterator.next();
            System.out.println(user.getName());
        }

    }
}

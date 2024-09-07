package Iterator_Design_Pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class UserManagement {

    private ArrayList<User> userList=new ArrayList<User>();
    public  void addUser(User user){
        userList.add(user);

    }
    public User getUser(int index){
        return userList.get(index);
    }

    public MyIterator getIterator(){
        return new MyIteratorImpl(userList);
    }

}

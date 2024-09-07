package Builder_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        User user=new User.UserBuilder().
                setEmailId("pankaj@gmail.com").
                setUserId(1233).
                setUserName("Pankaj").
                build();

        System.out.println(user);
        User user2=User.UserBuilder.builder().setEmailId("ankirt@gmail.com")
                .setUserId(2312)
                .setUserName("ankit").build();
        System.out.println(user2.toString());
    }
}

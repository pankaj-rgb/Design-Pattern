package Builder_Design_Pattern;

public class User {
        private final int userId;
        private final String userName;
        private final String emailId;

        private User(UserBuilder builder){
            this.userId=builder.userId;
            this.userName=builder.userName;
            this.emailId=builder.emailId;


            //initialize

        }

    public int  getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString(){
            return this.userName+"  : "+this.emailId+"  "+ this.userId;
    }

    //inner class to create objects
    static class UserBuilder{
            private int userId;
        private String userName;
        private String emailId;

        public UserBuilder(){
        }

        public  static  UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        public User build(){
            User user=new User(this);
            return user;
        }
    }
}

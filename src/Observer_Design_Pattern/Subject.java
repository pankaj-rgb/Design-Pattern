package Observer_Design_Pattern;

public interface Subject {

        void subscribe(Observer ob);
        void unsubscribe(Observer ob);
        void newVideoUplaod(String title);

}

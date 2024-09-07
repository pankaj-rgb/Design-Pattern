package Observer_Design_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        YoutubeChannel channel=new YoutubeChannel();
        Subscriber aman=new Subscriber("Aman");
        Subscriber raman=new Subscriber("Raman");

        channel.subscribe(aman);
        channel.subscribe(raman);
        channel.newVideoUplaod(" Learn design pattern");
        channel.newVideoUplaod(" New Angular Course");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println(" press 1 to upload video");
            System.out.println("press 2 to create new subscribe");
            System.out.println(" Press 3 to exit ");
            int c = Integer.parseInt(br.readLine());
            if(c==1){
                //new video upload
                System.out.println("enter video title");
                String videoTitle=br.readLine();
                channel.newVideoUplaod(videoTitle);
            } else if(c==2){
                //create new subscriber
                System.out.println("Enter the name of subscriber");
                String subsName=br.readLine();
                Subscriber subscriber3=new Subscriber(subsName);
                channel.subscribe(subscriber3);
            }
            else if (c==3){
                //exit
                System.out.println(" Thank you for using app");
                break;
            }else{
                //exit wrong input
                System.out.println("wrong Input ! please enter the correct details");
            }
        }
    }
}

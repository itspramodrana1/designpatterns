package FactoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationFactory {

    public static Notification sendNotification(String type){
        if(type.equals("EMAIL")){
            return new EmailNotification();
        } else if (type.equals("SMS")) {
          return new SmsNotification();
        }
        throw new IllegalArgumentException("Invalid type");
    }

    public static List<Notification> sendNotification(List<String> types){
        List<Notification> notification = new ArrayList<>();

        for(var type : types){
            if(type.equals("EMAIL")){
                notification.add(new EmailNotification());
            } else if (type.equals("SMS")) {
                notification.add(new SmsNotification());
            }
            throw new IllegalArgumentException("Invalid type");
        }
        return notification;
    }
}

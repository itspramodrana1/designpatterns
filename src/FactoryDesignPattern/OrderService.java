package FactoryDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderService {

//    EmailNotification emailNotification = new EmailNotification();
//    SmsNotification smsNotification = new SmsNotification();
//
//    public void sendNotificationEmail(){
//        emailNotification.send();
//    }
//
//    public void sendNotificationSms(){
//        smsNotification.send();
//    }


//    Notification notification;
//
//    public void sendNotification( String type){
//        if(type.equals("EMAIL")){
//            notification = new EmailNotification();
//        } else if (type.equals("SMS")) {
//           notification = new SmsNotification();
//        }
//        notification.send();
//    }


    public void sendNotification(){
        List<Notification> notifications = NotificationFactory.sendNotification(new ArrayList<>(Arrays.asList("EMAIL", "SMS")));
       for( var notification : notifications){
           notification.send();
       }
    }
}

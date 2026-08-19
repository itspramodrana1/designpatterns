package FactoryDesignPattern;

public class SmsNotification implements Notification{

    public void send(){
        System.out.println("Send SMS Message");
    }
}

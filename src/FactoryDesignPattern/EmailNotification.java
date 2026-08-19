package FactoryDesignPattern;

public class EmailNotification implements Notification {

    public void send(){
        System.out.println("Send Email Message");
    }
}

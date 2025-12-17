package OOP.day26;

public class SMSNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Message through SMS");
    }
}

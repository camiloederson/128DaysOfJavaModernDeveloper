package OOP.day26;

public class EmailNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Message through Email");
    }
}

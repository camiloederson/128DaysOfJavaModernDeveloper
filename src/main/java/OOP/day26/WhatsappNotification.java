package OOP.day26;

public class WhatsappNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Message through Whatsapp");
    }
}

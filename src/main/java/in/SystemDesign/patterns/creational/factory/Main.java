package in.SystemDesign.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        notificationFactory.createNotification("Email").send();

        notificationFactory.createNotification("Sms").send();
    }
}

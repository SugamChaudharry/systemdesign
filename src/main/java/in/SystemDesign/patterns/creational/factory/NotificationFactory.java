package in.SystemDesign.patterns.creational.factory;

public class NotificationFactory {

    Notification createNotification(String type){
        return switch (type) {
            case "Email", "email" -> new EmailNotification();
            case "SMS", "Sms", "sms" -> new SmsNotification();
            default -> throw new IllegalArgumentException(
                    "Unknown notification type");
        };
    }
}

package in.SystemDesign.patterns.creational.factory;

public class EmailNotification  implements Notification{
    @Override
    public void send() {
        System.out.println("Email Notification");
    }
}

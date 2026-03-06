package OOPS;
class EmailNotifier implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        System.out.println("[Email] to: " + recipient + " | " + message);
    }
}
class SlackNotifier implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        System.out.println("[Slack] channel: " + recipient + " | " + message);
    }
}
class WebHookNotifier implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        System.out.println("[Webhook] URL: " + recipient + " | " + message);
    }
}
public class InterfaceNotificationMain {
    public static void main(String[] args) {
        EmailNotifier obj = new EmailNotifier();
        obj.send("This Email has many Email","To My Friend");
        SlackNotifier obj2 = new SlackNotifier();
        obj2.send("This is a Slack Notification","To Office Channel");

    }
}

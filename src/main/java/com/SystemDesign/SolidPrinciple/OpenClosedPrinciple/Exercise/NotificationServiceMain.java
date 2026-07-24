package com.SystemDesign.SolidPrinciple.OpenClosedPrinciple.Exercise;

interface NotificationChannel {
    String send(String message);
}
class EmailChannel implements NotificationChannel {

    @Override
    public String send(String message) {
        return "Sending EMAIL: " + message;
    }
}
class SMSChannel implements NotificationChannel {

    @Override
    public String send(String message) {
        return "Sending SMS: " + message;
    }
}
class PushChannel implements NotificationChannel {

    @Override
    public String send(String message) {
        return "Sending PUSH: " + message;
    }
}
class SlackChannel implements NotificationChannel {

    @Override
    public String send(String message) {
        return "Sending SLACK: " + message;
    }
}
class NotificationService {
    private final NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public String sendNotification(String message) {
        return notificationChannel.send(message);
    }
}
// Usage
public class NotificationServiceMain {
    public static void main(String[] args) {
        NotificationService emailService =
                new NotificationService(new EmailChannel());

        NotificationService smsService =
                new NotificationService(new SMSChannel());

        NotificationService pushService =
                new NotificationService(new PushChannel());

        NotificationService slackService =
                new NotificationService(new SlackChannel());

        System.out.println(emailService.sendNotification("Your order has shipped!"));
        System.out.println(smsService.sendNotification("Your order has shipped!"));
        System.out.println(pushService.sendNotification("Your order has shipped!"));
        System.out.println(slackService.sendNotification("Your order has shipped!"));
    }
}

// TODO: Define a NotificationChannel interface with a send(message) method.
// TODO: Create EmailChannel, SMSChannel, PushChannel, and SlackChannel.
// TODO: Refactor NotificationService to accept a NotificationChannel.

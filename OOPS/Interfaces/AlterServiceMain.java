package OOPS.Interfaces;

interface NotificationService {
    void send(String recipient, String message);
}

class EmailNotifier implements NotificationService {
    public void send(String recipient, String message) {
        System.out.println("[Email] To : " + recipient + " | " + message);
    }
}

class SlackNotifier implements NotificationService {
    public void send(String recipient, String message) {
        System.out.println("[Slack] Channel: " + recipient + " | " + message);
    }
}

class WebhookNotifier implements NotificationService {
    public void send(String recipient, String message) {
        System.out.println("[Webhook] URL: " + recipient + " | " + message);
    }
}

class AlertService {
    private NotificationService notificationService;

    public AlertService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void triggerAlter(String recipient, String issue) {
        String alertMessage = "ALERT : " + issue;
        notificationService.send(recipient, alertMessage);
    }
}

public class AlterServiceMain {
    public static void main(String[] args) {
        AlertService service = new AlertService(new EmailNotifier());
        service.triggerAlter("ops@company.com", "CPU Usage");

        AlertService slackAlters = new AlertService(new SlackNotifier());
        slackAlters.triggerAlter("#Incidents", "Database Connectivity");

        AlertService webAlertService = new AlertService(new WebhookNotifier());
        webAlertService.triggerAlter("https://hooks.example.com/alerts", "Disk Usage Limit Exceeded");
    }
}

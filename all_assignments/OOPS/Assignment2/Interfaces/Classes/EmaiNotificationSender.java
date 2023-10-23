package all_assignments.OOPS.Assignment2.Interfaces.Classes;

import all_assignments.OOPS.Assignment2.Interfaces.EmailNotification;

public class EmaiNotificationSender implements EmailNotification {


    @Override
    public void settingRecipients(String recipient) {
        System.out.println("Email Notification: ");
        System.out.println(recipient);

    }

    @Override
    public void emailNotifications() {
        System.out.println("1 Unread Email");
    }
}

package all_assignments.OOPS.Assignment2.Interfaces.Classes;

import all_assignments.OOPS.Assignment2.Interfaces.EmailNotification;

public class EmaiNotificationSender implements EmailNotification {


    @Override
    public void settingRecipients() {
        System.out.println("Email Notification: ");
        System.out.println("abc10@gmail.com");
    }

    @Override
    public void emailNotifications() {
        System.out.println("1 Unread Email");
    }
}

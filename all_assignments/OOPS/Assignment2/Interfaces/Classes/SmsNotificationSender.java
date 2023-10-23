package all_assignments.OOPS.Assignment2.Interfaces.Classes;

import all_assignments.OOPS.Assignment2.Interfaces.SmsNotification;

public class SmsNotificationSender implements SmsNotification {


    @Override
    public void phoneNumbers() {
        System.out.println("Sms Notifiaction: ");
        System.out.println("416-111-0001");
    }

    @Override
    public void smsNotifications() {
        System.out.println("New Message");
    }
}

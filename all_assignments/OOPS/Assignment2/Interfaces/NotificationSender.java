package all_assignments.OOPS.Assignment2.Interfaces;

import all_assignments.OOPS.Assignment2.Interfaces.Classes.EmaiNotificationSender;
import all_assignments.OOPS.Assignment2.Interfaces.Classes.PushNotificationSender;
import all_assignments.OOPS.Assignment2.Interfaces.Classes.SmsNotificationSender;

public class NotificationSender {
    public static void main(String [] agrs){

        EmaiNotificationSender email = new EmaiNotificationSender();
        email.settingRecipients("abc10@gmail.com");
        email.emailNotifications();

        SmsNotificationSender sms = new SmsNotificationSender();
        sms.phoneNumbers();
        sms.smsNotifications();

        PushNotificationSender push = new PushNotificationSender();
        push.deviceNotifications();
    }
}

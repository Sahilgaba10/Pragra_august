package all_assignments.OOPS.Assignment2.Interfaces.Classes;

import all_assignments.OOPS.Assignment2.Interfaces.PushNotifications;

public class PushNotificationSender implements PushNotifications {


    @Override
    public void deviceNotifications() {
        System.out.println("Push Notification: ");
        System.out.println("Message Sent Successful!");
    }
}

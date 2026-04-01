package Program;

import FabricaAbstracta.NotificationFactory;
import FabricaConcreta.EmailNotificationFactory;
import FabricaConcreta.SMSNotificationFactory;
import ProdusAbstract.Notification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationFactory factoryEmail = new EmailNotificationFactory();
        Notification notification1 = factoryEmail.createNotification();
        notification1.send();

        NotificationFactory factorySMS = new SMSNotificationFactory();
        Notification notification2 = factorySMS.createNotification();
        notification2.send();
    }
}
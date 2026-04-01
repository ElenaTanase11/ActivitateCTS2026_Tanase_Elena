package FabricaConcreta;

import FabricaAbstracta.NotificationFactory;
import ProdusAbstract.Notification;
import ProdusConcret.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}

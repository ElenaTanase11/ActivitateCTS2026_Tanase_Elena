package FabricaConcreta;

import FabricaAbstracta.NotificationFactory;
import ProdusAbstract.Notification;
import ProdusConcret.EmailNotification;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

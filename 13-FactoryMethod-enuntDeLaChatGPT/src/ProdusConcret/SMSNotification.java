package ProdusConcret;

import ProdusAbstract.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Notificare trimisa prin SMS");
    }
}

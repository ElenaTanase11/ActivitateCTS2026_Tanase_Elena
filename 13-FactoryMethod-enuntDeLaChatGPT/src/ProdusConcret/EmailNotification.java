package ProdusConcret;

import ProdusAbstract.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Notificare trimisa prin email");
    }
}

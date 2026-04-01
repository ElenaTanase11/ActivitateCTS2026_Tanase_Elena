package ProdusConcret;

import ProdusAbstract.Delivery;

public class LockerDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Livrare la locker");
    }
}

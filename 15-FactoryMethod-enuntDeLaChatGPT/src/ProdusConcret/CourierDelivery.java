package ProdusConcret;

import ProdusAbstract.Delivery;

public class CourierDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Livrare prin curier");
    }
}

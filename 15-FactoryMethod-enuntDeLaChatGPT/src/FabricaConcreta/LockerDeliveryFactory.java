package FabricaConcreta;

import FabricaAbstracta.DeliveryFactory;
import ProdusAbstract.Delivery;
import ProdusConcret.LockerDelivery;

public class LockerDeliveryFactory implements DeliveryFactory {
    @Override
    public Delivery creareDelivery() {
        return new LockerDelivery();
    }
}

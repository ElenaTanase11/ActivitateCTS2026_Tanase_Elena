package FabricaConcreta;

import FabricaAbstracta.DeliveryFactory;
import ProdusAbstract.Delivery;
import ProdusConcret.CourierDelivery;

public class CourierDeliveryFactory implements DeliveryFactory {
    @Override
    public Delivery creareDelivery() {
        return new CourierDelivery();
    }
}

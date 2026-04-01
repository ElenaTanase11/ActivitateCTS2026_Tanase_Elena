package Program;

import FabricaAbstracta.DeliveryFactory;
import FabricaConcreta.CourierDeliveryFactory;
import FabricaConcreta.LockerDeliveryFactory;
import ProdusAbstract.Delivery;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DeliveryFactory deliveryFactory1 = new CourierDeliveryFactory();
        Delivery delivery = deliveryFactory1.creareDelivery();
        delivery.deliver();

        DeliveryFactory deliveryFactory2 = new LockerDeliveryFactory();
        Delivery delivery2 = deliveryFactory2.creareDelivery();
        delivery2.deliver();
    }
}
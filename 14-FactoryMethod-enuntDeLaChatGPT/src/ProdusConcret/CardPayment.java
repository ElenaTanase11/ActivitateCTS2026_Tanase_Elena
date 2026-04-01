package ProdusConcret;

import ProdusAbstract.Payment;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Plata card");
    }
}

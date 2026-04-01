package ProdusConcret;

import ProdusAbstract.Payment;

public class CashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Plata cash");
    }
}

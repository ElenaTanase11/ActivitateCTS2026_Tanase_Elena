package FabricaConcreta;

import FabricaAbstracta.PaymentFactory;
import ProdusAbstract.Payment;
import ProdusConcret.CardPayment;

public class CardPaymentFactory implements PaymentFactory {
    @Override
    public Payment crearePlata() {
        return new CardPayment();
    }
}

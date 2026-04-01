package FabricaConcreta;

import FabricaAbstracta.PaymentFactory;
import ProdusAbstract.Payment;
import ProdusConcret.CashPayment;

public class CashPaymentFactory implements PaymentFactory {
    @Override
    public Payment crearePlata() {
        return new CashPayment();
    }
}

package Program;

import FabricaAbstracta.PaymentFactory;
import FabricaConcreta.CardPaymentFactory;
import FabricaConcreta.CashPaymentFactory;
import ProdusAbstract.Payment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory1 = new CardPaymentFactory();
        Payment payment1 = paymentFactory1.crearePlata();
        payment1.pay();

        PaymentFactory paymentFactory2 = new CashPaymentFactory();
        Payment payment2 = paymentFactory2.crearePlata();
        payment2.pay();
    }
}
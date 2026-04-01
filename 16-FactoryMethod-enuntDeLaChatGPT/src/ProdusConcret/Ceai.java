package ProdusConcret;

import ProdusAbstract.Bautura;

public class Ceai implements Bautura {
    @Override
    public void prepara() {
        System.out.println("Se prepara ceaiul");
    }
}

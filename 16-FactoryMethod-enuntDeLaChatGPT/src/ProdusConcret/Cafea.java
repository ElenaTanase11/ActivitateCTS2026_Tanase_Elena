package ProdusConcret;

import ProdusAbstract.Bautura;

public class Cafea implements Bautura {
    @Override
    public void prepara() {
        System.out.println("Se prepara cafeaua");
    }
}

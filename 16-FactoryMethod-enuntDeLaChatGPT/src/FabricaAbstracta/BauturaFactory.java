package FabricaAbstracta;

import ProdusAbstract.Bautura;
import ProdusConcret.Cafea;
import ProdusConcret.Ceai;
import ProdusConcret.TipBautura;

public class BauturaFactory {
    public Bautura creareBautura(TipBautura tipBautura) {
        switch (tipBautura) {
            case CAFEA -> {
                return new Cafea();
            }
            case CEAI -> {
                return new Ceai();
            }
            default ->{
                return null;
            }
        }
    }
}

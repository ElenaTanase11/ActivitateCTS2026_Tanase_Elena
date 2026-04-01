package Program;

import FabricaAbstracta.BauturaFactory;
import ProdusAbstract.Bautura;
import ProdusConcret.TipBautura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BauturaFactory factory = new BauturaFactory();

        Bautura b1 = factory.creareBautura(TipBautura.CAFEA);
        Bautura b2 = factory.creareBautura(TipBautura.CEAI);

        b1.prepara();
        b2.prepara();
    }
}
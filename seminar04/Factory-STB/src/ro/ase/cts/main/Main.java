package ro.ase.cts.main;

import ro.ase.cts.factory.MijlocTranportFactory;
import ro.ase.cts.factory.MijlocTranportType;
import ro.ase.cts.vehicule.MijlocTransport;

public class Main {

    public static void afisareMijlocTransport(MijlocTransport mijlocTransport){
        mijlocTransport.afisareDescriere();
    }

    public static void main(String[] args) throws Exception {
        MijlocTranportFactory factory = MijlocTranportFactory.getInstance();

        MijlocTransport autobuz = factory.getMijlocTransport("Mercedes", 432, MijlocTranportType.AUTOBUZ);
        MijlocTransport tramvai = factory.getMijlocTransport("Astra", 1, MijlocTranportType.TRAMVAI);
        MijlocTransport troleibuz = factory.getMijlocTransport("Mercedes", 97, MijlocTranportType.TROLEIBUZ);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramvai);
        afisareMijlocTransport(troleibuz);

    }
}

package ro.ase.cts.factory;

import ro.ase.cts.vehicule.Autobuz;
import ro.ase.cts.vehicule.MijlocTransport;
import ro.ase.cts.vehicule.Tramvai;
import ro.ase.cts.vehicule.Troleibuz;

public class MijlocTranportFactory {
    public static MijlocTranportFactory instance;

    public static MijlocTranportFactory getInstance(){
        if (instance == null)
            instance = new MijlocTranportFactory();
        return instance;
    }

    private MijlocTranportFactory(){

    }


    public MijlocTransport getMijlocTransport(String marca, int linie, MijlocTranportType tip) throws Exception {
        if(tip == MijlocTranportType.AUTOBUZ)
            return new Autobuz(marca, linie);
        if(tip == MijlocTranportType.TRAMVAI)
            return new Tramvai(marca, linie);
        if(tip == MijlocTranportType.TROLEIBUZ)
            return new Troleibuz(marca, linie);
        throw new Exception("Tip invalid");
    }
}

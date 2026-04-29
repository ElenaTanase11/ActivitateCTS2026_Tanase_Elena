package ro.ase.cts.clase;

public class Validator {
    private double pret;
    private ModPlata modPlata;

    public Validator(double pret) {
        this.pret = pret;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void valideazaCalatorie(){
        if (modPlata == null) {
            System.out.println("Nu a fost selectat un mod de plata");
        }
        else {
            modPlata.plateste(pret);
            System.out.println("Calatoria a fost validata");
        }
    }
}

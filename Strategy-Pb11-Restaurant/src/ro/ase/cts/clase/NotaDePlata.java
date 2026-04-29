package ro.ase.cts.clase;

public class NotaDePlata {
    private double suma;
    private ModPlata modPlata;

    public NotaDePlata(double suma) {
        this.suma = suma;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteNota(){
        if (modPlata == null) {
            System.out.println("Nu a fost selectat un mod de plata");
        }
        else {
            modPlata.plateste(suma);
        }
    }
}

package ro.ase.cts.clase;

public class Factura {
    private double suma;
    private ModPlata modPlata;

    public Factura(double suma) {
        this.suma = suma;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteFactura(){
        if (modPlata == null) {
            System.out.println("Nu a fost selectat niciun mod de plata");
        }
        else {
            modPlata.plateste(suma);
        }
    }
}

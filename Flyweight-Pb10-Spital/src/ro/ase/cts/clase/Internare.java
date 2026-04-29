package ro.ase.cts.clase;

public class Internare {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Internare(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public void afiseazaInternare(Pacient pacient) {
        pacient.afiseazaInformatii();
        System.out.println("Salon: " + numarSalon + ", numar pat: " + numarPat + "numar zile spitalizare" + numarZileSpitalizare);
    }
}

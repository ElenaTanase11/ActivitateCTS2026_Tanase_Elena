package ro.ase.cts.clase;

public class Pacient {
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String nume, String numarTelefon, String adresa) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    public void afiseazaInformatii(){
        System.out.println("Pacient: " + nume + ", telefon: " + numarTelefon + ", adresa: " + adresa);
    }
}

package ro.ase.cts.clase;

public class Linie implements LinieTransport{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    protected Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaAutobuzLinie(Autobuz autobuz) {
        System.out.println(autobuz.toString());
        //System.out.println(this.toString());
        //System.out.println("Linie{" + "nrLinie=" + nrLinie + '}');
        System.out.println("Autobuzul: " + nrLinie + " circula de la " + this.primaStatie + " la " + this.ultimaStatie + " si pot merge maxim: " + autobuz.getNrLocuri() + " calatori");
    }

    @Override
    public void afiseazaNrMaximCalatoriPerTraseu(Autobuz autobuz) {
        System.out.println("De la " + this.primaStatie + " la " + this.ultimaStatie + " pot merge maxim: " + autobuz.getNrLocuri() + " calatori");
    }
}

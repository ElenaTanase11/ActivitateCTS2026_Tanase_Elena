package ro.ase.cts.clase;

public class PlataCardCalatorii implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cu cardul de calatorii in valoare de " + suma + " lei");
    }
}

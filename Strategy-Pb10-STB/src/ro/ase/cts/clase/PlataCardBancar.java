package ro.ase.cts.clase;

public class PlataCardBancar implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cu cardul bancar in valoare de " + suma + " lei");
    }
}

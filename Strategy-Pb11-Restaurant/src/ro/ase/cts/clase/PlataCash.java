package ro.ase.cts.clase;

public class PlataCash implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cash in valoare de: " + suma + " lei");
    }
}

package ro.ase.cts.clase;

public class PlataCard implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata card in valoare de: " + suma + " lei");
    }
}

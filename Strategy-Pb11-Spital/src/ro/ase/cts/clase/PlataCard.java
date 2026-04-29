package ro.ase.cts.clase;

public class PlataCard implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cu cardul de " + suma + " lei");
    }
}

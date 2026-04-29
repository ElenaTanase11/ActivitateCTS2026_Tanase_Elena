package ro.ase.cts.clase;

public class PlataSMS implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata prin SMS in valoare de " + suma + " lei");
    }
}

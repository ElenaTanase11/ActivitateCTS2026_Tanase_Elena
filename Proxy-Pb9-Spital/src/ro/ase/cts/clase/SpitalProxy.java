package ro.ase.cts.clase;

import javax.sound.sampled.Port;
import java.net.ProxySelector;

public class SpitalProxy implements ISpital{

    private Spital spital;

    public SpitalProxy(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if (pacient.isAreAsigurare()){
            spital.interneaza(pacient);
        }
        else {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat");
        }
    }
}

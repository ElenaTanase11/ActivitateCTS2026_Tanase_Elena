package ro.ase.cts.main;

import ro.ase.cts.clase.ISpital;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Spital;
import ro.ase.cts.clase.SpitalProxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ion", true);
        Pacient pacient2 = new Pacient("Mihai", false);

        Spital spital = new Spital("Spitalul Municipal");
        ISpital spitalProxy = new SpitalProxy(spital);

        spitalProxy.interneaza(pacient1);
        spitalProxy.interneaza(pacient2);
    }
}
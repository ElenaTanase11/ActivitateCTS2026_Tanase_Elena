package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Electric", 2000, 20);
        Autobuz autobuz2 = new Autobuz("Hybrid", 2002, 25);
        Autobuz autobuz3 = new Autobuz("Normal", 2004, 30);

        LinieFactory linieFactory = new LinieFactory();
        linieFactory.getLinie(102, "CFR", "Pantelimon").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinie(103, "Romana", "Universitate").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinie(104, "CFR", " ").afiseazaAutobuzLinie(autobuz3);

    }
}
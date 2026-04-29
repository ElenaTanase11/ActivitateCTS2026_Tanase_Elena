package ro.ase.cts.main;

import ro.ase.cts.clase.Internare;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PacientFactory pacientFactory = new PacientFactory();
        Pacient pacient1 = pacientFactory.getPacient("Ion", "072222", "Bucuresti");
        Pacient pacient2 = pacientFactory.getPacient("Ion", "072222", "Bucuresti");
        Pacient pacient3 = pacientFactory.getPacient("Maria", "072222", "Bucuresti");

        Internare internare1 = new Internare(10, 3, 4);
        Internare internare2 = new Internare(15, 2, 5);
        Internare internare3 = new Internare(12, 4, 6);

        internare1.afiseazaInternare(pacient1);
        internare2.afiseazaInternare(pacient2);
        internare3.afiseazaInternare(pacient3);

        System.out.println("Numar obiecte Pacient create: " + pacientFactory.getNumarPacienti());

        System.out.println(pacient1 == pacient2);
    }
}
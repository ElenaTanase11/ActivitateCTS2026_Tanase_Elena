package ro.ase.cts.main;

import ro.ase.cts.clase.ModPlata;
import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.PlataCard;
import ro.ase.cts.clase.PlataCash;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(200);

        notaDePlata.setModPlata(new PlataCard());
        notaDePlata.platesteNota();

        notaDePlata.setModPlata(new PlataCash());
        notaDePlata.platesteNota();
    }
}
package main;

import clase.AutobuzFacade;
import clase.Usa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usa usaFata = new Usa("fata");
        Usa usaMijloc = new Usa("mijloc");
        Usa usaSpate = new Usa("spate");

        AutobuzFacade autobuzFacade = new AutobuzFacade(usaFata, usaMijloc, usaSpate);

        autobuzFacade.puneToateUsileInModLiber();
        autobuzFacade.deschideToateUsileFortat();
    }
}
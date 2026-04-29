package ro.ase.cts.main;

import ro.ase.cts.clase.Factura;
import ro.ase.cts.clase.PlataCard;
import ro.ase.cts.clase.PlataCash;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(1000);

        factura.setModPlata(new PlataCard());
        factura.platesteFactura();

        factura.setModPlata(new PlataCash());
        factura.platesteFactura();
    }
}
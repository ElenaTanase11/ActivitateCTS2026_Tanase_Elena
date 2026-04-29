package ro.ase.cts.main;

import ro.ase.cts.clase.PlataCardBancar;
import ro.ase.cts.clase.PlataCardCalatorii;
import ro.ase.cts.clase.PlataSMS;
import ro.ase.cts.clase.Validator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(3);

        validator.setModPlata(new PlataCardCalatorii());
        validator.valideazaCalatorie();

        validator.setModPlata(new PlataCardBancar());
        validator.valideazaCalatorie();

        validator.setModPlata(new PlataSMS());
        validator.valideazaCalatorie();
    }
}
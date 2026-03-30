package main;

import simplefactory.FactoryPersonalSpital;
import simplefactory.PersonalSpital;
import simplefactory.TipPersonal;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        PersonalSpital angajat1 = FactoryPersonalSpital.crearePersonal(TipPersonal.ASISTENT, "Ana", 2);
        PersonalSpital angajat2 = FactoryPersonalSpital.crearePersonal(TipPersonal.ASISTENT, "Maria", 3);
        PersonalSpital angajat3 = FactoryPersonalSpital.crearePersonal(TipPersonal.BRANCARDIER, "Ionut", 4);
        PersonalSpital angajat4 = FactoryPersonalSpital.crearePersonal(TipPersonal.MEDIC, "Bianca", 5);

        angajat1.prezintaRol();
        angajat2.prezintaRol();
        angajat3.prezintaRol();
        angajat4.prezintaRol();
    }
}
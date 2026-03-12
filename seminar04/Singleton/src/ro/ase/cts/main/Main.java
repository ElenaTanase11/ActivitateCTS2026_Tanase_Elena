package ro.ase.cts.main;

import ro.ase.cts.lazy.Hotel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Hotelul 1", 2, 4);
        Hotel hotel2 = Hotel.getInstance("Hotelul 2", 6, 20);
        //cu alte valori este aceeasi instanta, alta referinta

        hotel1.afisareInchiriereCamera();
        hotel1.afisareInchiriereCamera();

        hotel2.afisareInchiriereCamera();
        hotel2.afisareInchiriereCamera();

        // Hotel hotel3 = new Hotel(); trebuie sa avem eroare aici
    }
}

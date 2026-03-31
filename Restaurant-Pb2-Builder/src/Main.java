B//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new RezervareBuilder("Ana", 3, 10).setDecorareMasa(true).setScaunErgonomic(true).setAsezareGeam(true).setGenMuzica(GenMuzica.POP).setMuzicaAmbientala(true).build();
        Rezervare rezervare2 = new RezervareBuilder("Mihai", 3, 10).build();
        Rezervare rezervare3 = new RezervareBuilder("Alex", 3, 10).build();
        Rezervare rezervare4 = new RezervareBuilder("Ioana", 3, 10).build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
        System.out.println(rezervare4);

    }
}
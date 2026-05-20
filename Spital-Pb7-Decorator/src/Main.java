//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IRezultat rezultatPrintat = new RezultatPrintat();

        rezultatPrintat.puneLaDispozitieRezultat();

        System.out.println("----------");

        IRezultat rezultatOnline = new RezultatOnlineDecorator(rezultatPrintat);

        rezultatOnline.puneLaDispozitieRezultat();
    }
}
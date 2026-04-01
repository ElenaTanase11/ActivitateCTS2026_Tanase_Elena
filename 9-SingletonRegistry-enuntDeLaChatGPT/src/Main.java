//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Apartament ap1 = new Apartament("Strada1", 1000);
        Apartament ap2 = new Apartament("Strada2", 2000);

        ApartamentRegistry.register("AP1", ap1);
        ApartamentRegistry.register("AP2", ap2);

        Apartament apartamentGasit = ApartamentRegistry.getApartament("AP1");

        System.out.println(apartamentGasit.getAddress());
        System.out.println(apartamentGasit.getPrice());
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Vehicle vehicul1 = new Vehicle("VW", "Negru");
        Vehicle vehicul2 = new Vehicle("BMW", "Albastru");

        VehicleRegistry.register("V1", vehicul1);
        VehicleRegistry.register("V2", vehicul2);

        Vehicle vehiculCautat = VehicleRegistry.getVehicle("V1");

        System.out.println(vehiculCautat.getColor());
        System.out.println(vehiculCautat.getModel());
    }
}
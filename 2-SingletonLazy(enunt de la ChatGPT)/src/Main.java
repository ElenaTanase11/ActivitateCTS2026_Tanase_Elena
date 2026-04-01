//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParkingBarrier parcare1 = ParkingBarrier.getInstance();
        ParkingBarrier parcare2 = ParkingBarrier.getInstance();

        System.out.println(parcare1 == parcare2);

        parcare1.openBarrier();
        System.out.println(parcare1.isBarrierOpen());
        parcare1.closeBarrier();
        System.out.println(parcare1.isBarrierOpen());

        parcare2.setLocation("Nord");
        System.out.println(parcare2.getLocation());
    }
}
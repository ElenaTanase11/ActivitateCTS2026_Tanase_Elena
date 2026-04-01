//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClimateControl climate1 = ClimateControl.getInstance();
        ClimateControl climate2 = ClimateControl.getInstance();

        System.out.println(climate1 == climate2);

        climate1.startSystem();
        System.out.println(climate1.isSystemRunning());
        climate1.stopSystem();
        System.out.println(climate1.isSystemRunning());

        climate2.setTemperature(20f);
        climate2.startSystem();
        System.out.println(climate1.getTemperature());
        System.out.println(climate2.isSystemRunning());
        climate2.stopSystem();

    }
}
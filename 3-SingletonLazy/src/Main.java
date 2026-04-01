//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IrrigationSystem sistem1 = IrrigationSystem.getInstance( true,  "systemName",  10f);
        IrrigationSystem sistem2 = IrrigationSystem.getInstance(false,  "systemName2",  11f);

        System.out.println(sistem1 == sistem2);
        sistem1.startSystem();
        System.out.println(sistem1.getSystemName());
        System.out.println(sistem1.getWaterFlow());
        System.out.println(sistem1.isRunning());
        sistem1.stopSystem();
        System.out.println(sistem1.isRunning());

        System.out.println(sistem2.getSystemName());
        System.out.println(sistem2.getWaterFlow());
        System.out.println(sistem2.isRunning());
    }
}
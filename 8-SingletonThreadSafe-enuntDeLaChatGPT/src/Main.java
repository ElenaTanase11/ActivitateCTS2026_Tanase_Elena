//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TemperatureMonitor temp1 = TemperatureMonitor.getInstance("Nume1", 10f, true);
        TemperatureMonitor temp2 = TemperatureMonitor.getInstance("Nume2", 20f, true);

        System.out.println(temp1 == temp2);

        temp1.activateMonitor();
        System.out.println(temp1.getCurrentTemperature());
        System.out.println(temp1.getMonitorName());
        System.out.println(temp1.isActive());
        temp1.deactivateMonitor();
        System.out.println(temp2.isActive());
    }
}
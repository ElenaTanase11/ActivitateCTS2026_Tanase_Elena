//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AbstractLightingSystem sistem1 = LightingSystem.getInstance("Nume1", 100, true);
        AbstractLightingSystem sistem2 = LightingSystem.getInstance("Nume2", 200, false);

        System.out.println(sistem1 == sistem2);

        sistem1.startSystem();
        System.out.println(sistem1.getSystemName());
        System.out.println(sistem1.getIntensity());
        System.out.println(sistem2.getSystemName());
        sistem1.stopSystem();

    }
}
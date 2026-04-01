//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DisplayPanel panel1 = DisplayPanel.getInstance(true, "Nume1", 10);
        DisplayPanel panel2 = DisplayPanel.getInstance(false, "Nume2", 20);

        System.out.println(panel1 == panel2);
        panel1.startPanel();
        System.out.println(panel1.getPanelName());
        System.out.println(panel1.getAvailableSpots());
        panel2.startPanel();
        System.out.println(panel2.getPanelName());
    }
}
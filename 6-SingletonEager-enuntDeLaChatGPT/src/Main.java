//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InfoPanel panel1 = InfoPanel.getInstance("Nuume", 20, false);
        InfoPanel panel2 = InfoPanel.getInstance("Alt nuume", 200, true);

        System.out.println(panel1 == panel2);

        panel1.startPanel();
        System.out.println(panel1.getPanelName());
        System.out.println(panel1.getActiveAnnouncements());
        System.out.println(panel2.getPanelName());
        System.out.println(panel2.getActiveAnnouncements());
        System.out.println(panel1.isStarted());
        panel1.stopPanel();
        System.out.println(panel2.isStarted());
    }
}
public class DisplayPanel implements IDisplayPanel{
    private boolean panel;
    private String panelName;
    private int availableSpots;

    private static final DisplayPanel instance = new DisplayPanel(true, "Nume prestabilit", 0);

    public static DisplayPanel getInstance(boolean panel, String panelName, int availableSpots) {
        return instance;
    }

    private DisplayPanel(boolean panel, String panelName, int availableSpots) {
        this.panel = panel;
        this.panelName = panelName;
        this.availableSpots = availableSpots;
    }

    @Override
    public void startPanel() {
        panel = true;
        System.out.println("Panoul este pornit");
    }

    @Override
    public void stopPanel() {
        panel = false;
        System.out.println("Panoul este oprit");
    }

    @Override
    public String getPanelName() {
        return panelName;
    }

    @Override
    public int getAvailableSpots() {
        return availableSpots;
    }

    @Override
    public boolean isStarted() {
        return panel;
    }
}

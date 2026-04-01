public class InfoPanel extends AbstractInfoPanel{
    private static final InfoPanel instance = new InfoPanel("Nume setat", 10, true);

    private InfoPanel(String panelName, int activeAnnouncements, boolean started) {
        this.panelName = panelName;
        this.activeAnnouncements = activeAnnouncements;
        this.started = started;
    }

    public static InfoPanel getInstance(String panelName, int activeAnnouncements, boolean started){
        return instance;
    }

    @Override
    public void startPanel() {
        started = true;
        System.out.println("Panel pornit");
    }

    @Override
    public void stopPanel() {
        started = false;
        System.out.println("Panel oprit");
    }

    @Override
    public String getPanelName() {
        return panelName;
    }

    @Override
    public int getActiveAnnouncements() {
        return activeAnnouncements;
    }

    @Override
    public boolean isStarted() {
        return started;
    }
}

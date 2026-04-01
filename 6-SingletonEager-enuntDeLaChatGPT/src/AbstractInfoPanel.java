public abstract class AbstractInfoPanel {
    protected String panelName;
    protected int activeAnnouncements;
    protected boolean started;

    public abstract void startPanel();
    public abstract void stopPanel();
    public abstract String getPanelName();
    public abstract int getActiveAnnouncements();
    public abstract boolean isStarted();
}
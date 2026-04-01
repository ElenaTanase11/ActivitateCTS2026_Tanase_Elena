public interface IDisplayPanel {
    void startPanel();
    void stopPanel();
    String getPanelName();
    int getAvailableSpots();
    boolean isStarted();
}
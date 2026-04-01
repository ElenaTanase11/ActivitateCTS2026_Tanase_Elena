public interface IIrrigationSystem {
    void startSystem();
    void stopSystem();
    String getSystemName();
    float getWaterFlow();
    boolean isRunning();
}
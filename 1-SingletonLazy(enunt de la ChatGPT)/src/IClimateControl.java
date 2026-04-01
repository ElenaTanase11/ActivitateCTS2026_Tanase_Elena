public interface IClimateControl {
    void startSystem();
    void stopSystem();
    void setTemperature(float temperatura);
    float getTemperature();
    boolean isSystemRunning();
}
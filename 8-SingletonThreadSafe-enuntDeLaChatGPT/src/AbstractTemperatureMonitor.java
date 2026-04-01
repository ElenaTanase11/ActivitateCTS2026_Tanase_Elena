public abstract class AbstractTemperatureMonitor {
    protected String monitorName;
    protected float currentTemperature;
    protected boolean active;

    public abstract void activateMonitor();
    public abstract void deactivateMonitor();
    public abstract String getMonitorName();
    public abstract float getCurrentTemperature();
    public abstract boolean isActive();
}
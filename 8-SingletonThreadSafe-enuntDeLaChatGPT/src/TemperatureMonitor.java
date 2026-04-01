public class TemperatureMonitor extends AbstractTemperatureMonitor{

    private static TemperatureMonitor instance = null;

    private TemperatureMonitor(String monitorName, float currentTemperature, boolean active) {
        this.monitorName = monitorName;
        this.currentTemperature = currentTemperature;
        this.active = active;
    }

    public static synchronized TemperatureMonitor getInstance(String monitorName, float currentTemperature, boolean active){
        if (instance == null) {
            instance = new TemperatureMonitor(monitorName, currentTemperature, active);
        }
        return instance;
    }

    @Override
    public void activateMonitor() {
        active = true;
        System.out.println("Monitor activat");
    }

    @Override
    public void deactivateMonitor() {
        active = false;
        System.out.println("Monitor dezactivat");
    }

    @Override
    public String getMonitorName() {
        return monitorName;
    }

    @Override
    public float getCurrentTemperature() {
        return currentTemperature;
    }

    @Override
    public boolean isActive() {
        return active;
    }
}

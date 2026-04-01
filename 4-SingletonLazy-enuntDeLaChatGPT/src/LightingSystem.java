import java.util.List;

public class LightingSystem extends AbstractLightingSystem{
    private static LightingSystem instance = null;

    private LightingSystem(String systemName, int intensity, boolean started) {
        this.systemName = systemName;
        this.intensity = intensity;
        this.started = started;
    }

    public static LightingSystem getInstance(String systemName, int intensity, boolean started){
        if (instance == null) {
            instance = new LightingSystem(systemName, intensity, started);
        }
        return instance;
    }

    @Override
    public void startSystem() {
        started = true;
        System.out.println("Sistemul a pornit");
    }

    @Override
    public void stopSystem() {
        started = false;
        System.out.println("Sistemul s-a oprit");
    }

    @Override
    public String getSystemName() {
        return systemName;
    }

    @Override
    public int getIntensity() {
        return intensity;
    }

    @Override
    public boolean isStarted() {
        return started;
    }
}

public abstract class AbstractLightingSystem {
    protected String systemName;
    protected int intensity;
    protected boolean started;

    public abstract void startSystem();
    public abstract void stopSystem();
    public abstract String getSystemName();
    public abstract int getIntensity();
    public abstract boolean isStarted();
}
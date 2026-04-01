public class IrrigationSystem implements IIrrigationSystem{
    private boolean system;
    private String systemName;
    private float waterFlow;

    private static IrrigationSystem instance = null;

    private IrrigationSystem(boolean system, String systemName, float waterFlow) {
        this.system = system;
        this.systemName = systemName;
        this.waterFlow = waterFlow;
    }

    public static IrrigationSystem getInstance(boolean system, String systemName, float waterFlow){
        if (instance == null) {
            instance = new IrrigationSystem(system, systemName, waterFlow);
        }
        return instance;
    }

    @Override
    public void startSystem() {
        system = true;
        System.out.println("Sistemul a pornit");
    }

    @Override
    public void stopSystem() {
        system = false;
        System.out.println("Sistemul s-a oprit");

    }

    @Override
    public String getSystemName() {
        return systemName;
    }

    @Override
    public float getWaterFlow() {
        return waterFlow;
    }

    @Override
    public boolean isRunning() {
        return system;
    }
}

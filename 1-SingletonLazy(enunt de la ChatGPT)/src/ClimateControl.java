public class ClimateControl implements IClimateControl{
    private boolean system;
    private float temperatura;

    private static ClimateControl instance = null;

    private ClimateControl(){

    }

    public static ClimateControl getInstance(){
        if (instance == null) {
            instance = new ClimateControl();
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
    public void setTemperature(float temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public float getTemperature() {
        return temperatura;
    }

    @Override
    public boolean isSystemRunning() {
        return system;
    }
}

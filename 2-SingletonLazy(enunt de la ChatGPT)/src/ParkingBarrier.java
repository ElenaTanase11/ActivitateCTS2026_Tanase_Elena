public class ParkingBarrier implements IParkingBarrier{
    private boolean barrier;
    private String location;

    private static ParkingBarrier instance = null;

    private ParkingBarrier(){
        this.barrier = false;
        this.location = "";
    }

    public static ParkingBarrier getInstance(){
        if (instance == null) {
            instance = new ParkingBarrier();
        }
        return instance;
    }

    @Override
    public void openBarrier() {
        barrier = true;
        System.out.println("Bariera este deschisa");
    }

    @Override
    public void closeBarrier() {
        barrier = false;
        System.out.println("Bariera este inchisa");
    }

    @Override
    public boolean isBarrierOpen() {
        return barrier;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }
}

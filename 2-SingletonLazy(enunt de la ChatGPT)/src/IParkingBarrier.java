public interface IParkingBarrier {
    void openBarrier();
    void closeBarrier();
    boolean isBarrierOpen();
    void setLocation(String location);
    String getLocation();
}
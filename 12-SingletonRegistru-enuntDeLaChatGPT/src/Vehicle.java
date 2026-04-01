public class Vehicle implements IVehicle{
    private String model;
    private String culoare;

    public Vehicle(String model, String culoare) {
        this.model = model;
        this.culoare = culoare;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return culoare;
    }
}

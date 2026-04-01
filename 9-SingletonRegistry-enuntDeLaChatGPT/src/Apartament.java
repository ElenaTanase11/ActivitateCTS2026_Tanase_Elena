public class Apartament implements IApartment {
    private String address;
    private float price;

    public Apartament(String address, float price) {
        this.address = address;
        this.price = price;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public float getPrice() {
        return price;
    }
}

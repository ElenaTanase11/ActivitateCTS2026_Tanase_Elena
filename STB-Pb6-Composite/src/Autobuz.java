public class Autobuz implements ComponentaAutobuz{
    private String producator;
    private String model;
    private int numarLocuri;

    public Autobuz(String producator, String model, int numarLocuri) {
        this.producator = producator;
        this.model = model;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public void afiseazaDEtalii() {
        System.out.println("Autobuz: " + producator + ", model " + model + ", numar locuri: " + numarLocuri);
    }
}

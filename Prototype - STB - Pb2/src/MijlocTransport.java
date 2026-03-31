public class MijlocTransport implements PrototypeMijlocTransport{
    private String model;
    private int numarLocuri;
    private int linie;

    public MijlocTransport(String model, int numarLocuri, int linie) {
        if (model.length() >= 3) {
            this.model = model;
        }
        if (numarLocuri > 5) {
            this.numarLocuri = numarLocuri;
        }
        if (linie != 0) {
            this.linie = linie;
        }
    }

    private MijlocTransport() {
    }

    public void setLinie(int linie) {
        this.linie = linie;
    }

    @Override
    public PrototypeMijlocTransport copiaza() {
        MijlocTransport mijlocTransportNou = new MijlocTransport();
        mijlocTransportNou.model = this.model;
        mijlocTransportNou.numarLocuri = this.numarLocuri;
        mijlocTransportNou.linie = this.linie;
        return mijlocTransportNou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocTransport{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numarLocuri=").append(numarLocuri);
        sb.append(", linie=").append(linie);
        sb.append('}');
        return sb.toString();
    }
}

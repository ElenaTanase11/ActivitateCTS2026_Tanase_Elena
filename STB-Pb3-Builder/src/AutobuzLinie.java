public class AutobuzLinie{
    //obligatorii
    private String modelAutobuz;
    private String sofer;

    //optionale
    private boolean oprireLaCapatDeLinie;
    private boolean deschideUsileInFiecareStatie;
    private String textEcranDerulator;

    public AutobuzLinie(String modelAutobuz, String sofer, boolean oprireLaCapatDeLinie, boolean deschideUsileInFiecareStatie, String textEcranDerulator) {
        this.modelAutobuz = modelAutobuz;
        this.sofer = sofer;
        this.oprireLaCapatDeLinie = oprireLaCapatDeLinie;
        this.deschideUsileInFiecareStatie = deschideUsileInFiecareStatie;
        this.textEcranDerulator = textEcranDerulator;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "modelAutobuz='" + modelAutobuz + '\'' +
                ", sofer='" + sofer + '\'' +
                ", oprireLaCapatDeLinie=" + oprireLaCapatDeLinie +
                ", deschideUsileInFiecareStatie=" + deschideUsileInFiecareStatie +
                ", textEcranDerulator=" + textEcranDerulator +
                '}';
    }
}

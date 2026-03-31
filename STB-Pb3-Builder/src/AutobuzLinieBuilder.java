public class AutobuzLinieBuilder implements IAutobuzLinie{
    //obligatorii
    private String modelAutobuz;
    private String sofer;

    //optionale
    private boolean oprireLaCapatDeLinie;
    private boolean deschideUsileInFiecareStatie;
    private String textEcranDerulator;

    public AutobuzLinieBuilder(String modelAutobuz, String sofer) {
        this.modelAutobuz = modelAutobuz;
        this.sofer = sofer;
    }

    public AutobuzLinieBuilder setOprireLaCapatDeLinie(boolean oprireLaCapatDeLinie) {
        this.oprireLaCapatDeLinie = oprireLaCapatDeLinie;
        return this;
    }

    public AutobuzLinieBuilder setDeschideUsileInFiecareStatie(boolean deschideUsileInFiecareStatie) {
        this.deschideUsileInFiecareStatie = deschideUsileInFiecareStatie;
        return this;
    }

    public AutobuzLinieBuilder setTextEcranDerulator(String textEcranDerulator) {
        this.textEcranDerulator = textEcranDerulator;
        return this;
    }

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(modelAutobuz, sofer, oprireLaCapatDeLinie, deschideUsileInFiecareStatie, textEcranDerulator);
    }

}

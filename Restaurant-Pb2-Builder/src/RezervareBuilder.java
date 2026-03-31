public class RezervareBuilder implements AbstractBuilder{
    //obligatorii
    private String numeClient;
    private int nrPersoane;
    private int oraRezervare;

    //optionale
    private boolean asezareGeam;
    private boolean scaunErgonomic;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private GenMuzica genMuzica;

    public RezervareBuilder(String numeClient, int nrPersoane, int oraRezervare) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(numeClient, nrPersoane, oraRezervare, asezareGeam, scaunErgonomic, decorareMasa, muzicaAmbientala, genMuzica);
    }

    @Override
    public AbstractBuilder setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    @Override
    public AbstractBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    @Override
    public AbstractBuilder setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    @Override
    public AbstractBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    @Override
    public AbstractBuilder setGenMuzica(GenMuzica genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}

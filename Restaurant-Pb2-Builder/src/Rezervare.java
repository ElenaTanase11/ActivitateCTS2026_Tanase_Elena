public class Rezervare {
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

    public Rezervare(String numeClient, int nrPersoane, int oraRezervare, boolean asezareGeam, boolean scaunErgonomic, boolean decorareMasa, boolean muzicaAmbientala, GenMuzica genMuzica) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
        this.asezareGeam = asezareGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", asezareGeam=").append(asezareGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }
}

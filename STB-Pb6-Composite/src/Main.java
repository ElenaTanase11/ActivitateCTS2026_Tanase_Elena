//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes", "Sprinter", 10);
        Autobuz autobuz2 = new Autobuz("Otokar", "Navigo", 10);
        Autobuz autobuz3 = new Autobuz("Solaris", "Urbino", 30);
        Autobuz autobuz4 = new Autobuz("Mercedes", "Citaro", 50);

        GrupAutobuze grupMic = new GrupAutobuze("Grup mic - 10 locuri");
        GrupAutobuze grupMediu = new GrupAutobuze("Grup mediu - 30 locuri");
        GrupAutobuze grupMare = new GrupAutobuze("Grup mare - 50 locuri");

        grupMic.adaugaElement(autobuz1);
        grupMic.adaugaElement(autobuz2);

        grupMediu.adaugaElement(autobuz3);

        grupMare.adaugaElement(autobuz4);

        GrupAutobuze flotaSTB = new GrupAutobuze("Flota STB");

        flotaSTB.adaugaElement(grupMic);
        flotaSTB.adaugaElement(grupMediu);
        flotaSTB.adaugaElement(grupMare);

        flotaSTB.afiseazaDEtalii();
    }
}
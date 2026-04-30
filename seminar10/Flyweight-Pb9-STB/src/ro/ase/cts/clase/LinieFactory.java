package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    public Map<Integer, LinieTransport> linii = new HashMap<>();

    public LinieTransport getLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        if (linii.containsKey(nrLinie)) {
            return linii.get(nrLinie);
        }
        else {
            LinieTransport linieTransport = new Linie(nrLinie, primaStatie, ultimaStatie);
            linii.put(nrLinie, linieTransport);
            return linieTransport;
        }
    }
}

package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class PacientFactory {
    private Map<String, Pacient> pacienti;

    public PacientFactory() {
        this.pacienti = new HashMap<>();
    }

    public Pacient getPacient(String nume, String numarTelefon, String adresa) {
        String cheie = nume + "_" + numarTelefon;

        if (!pacienti.containsKey(cheie)) {
            Pacient pacient = new Pacient(nume, numarTelefon, adresa);
            pacienti.put(cheie, pacient);
        }
        return pacienti.get(cheie);
    }

    public int getNumarPacienti(){
        return pacienti.size();
    }
}

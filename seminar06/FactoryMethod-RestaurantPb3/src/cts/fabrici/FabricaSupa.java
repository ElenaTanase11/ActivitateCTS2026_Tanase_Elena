package cts.fabrici;

import cts.clase.FelDeMancare;
import cts.clase.SupaDeCiuperci;
import cts.clase.SupaDeLegume;
import cts.enums.TipFelDeMancare;
import cts.enums.TipSupa;

public class FabricaSupa implements FabricaFelDeMancare{
    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return switch (tip) {
            case TipSupa.SupaDeLegume -> new SupaDeLegume(gramaj, pret);
            case TipSupa.SupaDeCiuperci -> new SupaDeCiuperci(gramaj, pret);
            default -> null;
        };
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii) {
        return creareFelDeMancare(tip, gramaj, pret);
    }
}

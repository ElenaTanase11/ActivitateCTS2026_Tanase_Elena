package cts.fabrici;

import cts.clase.Clatite;
import cts.clase.FelDeMancare;
import cts.clase.Papanasi;
import cts.enums.TipDesert;
import cts.enums.TipFelDeMancare;

public class FabricaDesert implements FabricaFelDeMancare{
    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return creareFelDeMancare(tip, gramaj, pret, 500);
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii) {
        return switch (tip) {
            case TipDesert.Papanasi -> new Papanasi(nrCalorii, pret, gramaj);
            case TipDesert.Clatite -> new Clatite(nrCalorii, pret, gramaj);
            default -> null;
        };
    }
}

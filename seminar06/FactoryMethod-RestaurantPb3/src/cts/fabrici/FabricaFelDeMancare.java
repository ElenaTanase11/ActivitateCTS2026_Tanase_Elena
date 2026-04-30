package cts.fabrici;

import cts.clase.FelDeMancare;
import cts.enums.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret);
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii);
}

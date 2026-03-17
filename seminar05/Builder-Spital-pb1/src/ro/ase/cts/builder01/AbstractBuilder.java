package ro.ase.cts.builder01;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setMicDejunInclus(boolean micDejunInclus);
    AbstractBuilder setPapuciCamera (boolean papuciCamera);
    AbstractBuilder setHalat (boolean halat);
}

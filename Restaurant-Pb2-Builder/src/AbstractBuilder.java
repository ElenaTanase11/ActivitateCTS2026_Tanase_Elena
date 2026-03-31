public interface AbstractBuilder {
    Rezervare build();
    AbstractBuilder setAsezareGeam(boolean asezareGeam);
    AbstractBuilder setScaunErgonomic(boolean scaunErgonomic);
    AbstractBuilder setDecorareMasa(boolean decorareMasa);
    AbstractBuilder setMuzicaAmbientala(boolean muzicaAmbientala);
    AbstractBuilder setGenMuzica(GenMuzica genMuzica);
}

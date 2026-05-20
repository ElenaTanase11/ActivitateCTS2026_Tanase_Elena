public interface ISubject {
    void adaugaObserver(IObserver observer);
    void stergeObserver(IObserver observer);
    void notificaObserveri(String mesaj);
}

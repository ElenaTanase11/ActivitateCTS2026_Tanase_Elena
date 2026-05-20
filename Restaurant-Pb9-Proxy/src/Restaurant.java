public class Restaurant implements IRezervare{
    @Override
    public void rezervaMasa(int numarPersoane) {
        System.out.println("A fost realizata rezervarea pentru " + numarPersoane + " persoane.");
    }
}

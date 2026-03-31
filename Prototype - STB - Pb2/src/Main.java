//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrototypeMijlocTransport mijlocTransport1 = new MijlocTransport("Mercedes", 30, 102);
        PrototypeMijlocTransport mijlocTransport2 = mijlocTransport1.copiaza();
        ((MijlocTransport) mijlocTransport2).setLinie(530);

        System.out.println(mijlocTransport1);
        System.out.println(mijlocTransport2);
    }
}
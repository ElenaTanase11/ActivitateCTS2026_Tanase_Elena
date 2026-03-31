//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrototypeReteta reteta1 = new Reteta("Ibuprofen", 1, 2, 3);
        PrototypeReteta reteta2 = reteta1.copiaza();

        ((Reteta) reteta1).setCantitateSolutie1(5);
        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}
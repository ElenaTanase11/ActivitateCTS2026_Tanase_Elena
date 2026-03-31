//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AutobuzLinie autobuz1 = new AutobuzLinieBuilder("Mercedez", "Alin").setDeschideUsileInFiecareStatie(true).build();
        System.out.println(autobuz1);
    }
}
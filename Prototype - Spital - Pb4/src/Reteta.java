public class Reteta implements PrototypeReteta{
    private String denumireMedicament;
    private double cantitateSolutie1;
    private double cantitateSolutie2;
    private double cantitateSolutie3;

    public Reteta(String denumireMedicament, double cantitateSolutie1, double cantitateSolutie2, double cantitateSolutie3) {
        if (denumireMedicament.length() >= 3) {
            this.denumireMedicament = denumireMedicament;
        } else {
            this.denumireMedicament = "Medicament necunoscut";
        }
        if (cantitateSolutie1 > 0) {
            this.cantitateSolutie1 = cantitateSolutie1;
        }
        else {
            cantitateSolutie1 = 0.1;
        }
        if (cantitateSolutie2 > 0) {
            this.cantitateSolutie2 = cantitateSolutie2;
        }
        else {
            cantitateSolutie2 = 0.1;
        }
        if (cantitateSolutie3 > 0) {
            this.cantitateSolutie3 = cantitateSolutie3;
        }
        else {
            cantitateSolutie3 = 0.1;
        }
    }

    private Reteta() {
    }

    public void setCantitateSolutie1(double cantitateSolutie1) {
        this.cantitateSolutie1 = cantitateSolutie1;
    }

    public void setCantitateSolutie2(double cantitateSolutie2) {
        this.cantitateSolutie2 = cantitateSolutie2;
    }

    public void setCantitateSolutie3(double cantitateSolutie3) {
        this.cantitateSolutie3 = cantitateSolutie3;
    }

    @Override
    public PrototypeReteta copiaza() {
        Reteta retetaNoua = new Reteta();
        retetaNoua.denumireMedicament = this.denumireMedicament;
        retetaNoua.cantitateSolutie1 = this.cantitateSolutie1;
        retetaNoua.cantitateSolutie2 = this.cantitateSolutie2;
        retetaNoua.cantitateSolutie3 = this.cantitateSolutie3;
        return retetaNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append(", cantitateSolutie1=").append(cantitateSolutie1);
        sb.append(", cantitateSolutie2=").append(cantitateSolutie2);
        sb.append(", cantitateSolutie3=").append(cantitateSolutie3);
        sb.append('}');
        return sb.toString();
    }
}

package ro.ase.cts.clase.spital;

public class Medicament {
    private String numeMedicament;
    private float pretMedicament;

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public Medicament(String numeMedicament, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Este achitionat medicamentul " + this.numeMedicament + " la pretul de " + this.pretMedicament);
        }
        else {
            System.out.println("Pentru medicamentul " + this.numeMedicament + " este nevoie de reteta");
        }
    }

    private boolean prezintaReteta(){
        return numeMedicament.contains("reteta");
    }
}

package p15_09_2023.zadatak2;

public class Student extends Osoba{
    private int index;
    private double dugSkolarine;

    public Student(String imePrezime, String jmbg, int index, double dugSkolarine) {
        super(imePrezime, jmbg);
        this.index = index;
        this.dugSkolarine = dugSkolarine;
    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("Index: " + this.index);
        System.out.println("Dug za skolarinu: " + this.dugSkolarine);
    }

    public void platiSkolarinu (double iznos) {
        this.dugSkolarine -= iznos;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getDugSkolarine() {
        return dugSkolarine;
    }

    public void setDugSkolarine(double dugSkolarine) {
        this.dugSkolarine = dugSkolarine;
    }
}

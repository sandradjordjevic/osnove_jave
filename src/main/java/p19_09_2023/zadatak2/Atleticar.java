package p19_09_2023.zadatak2;

public abstract class Atleticar {
    private String ime;
    protected double rezultat;

    public Atleticar(String ime, double rezultat) {
        this.ime = ime;
        this.rezultat = rezultat;
    }

    public abstract boolean daLiJeRezultatBolji (Atleticar atleticar);
    public void stampaj () {
        System.out.println(this.ime + ", " + this.rezultat);

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }
}

package d19_09_2023.zadatak1;

public class SuperKartica {
    private String broj;
    private String vlasnik;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(String broj, String vlasnik, double popust) {
        this.broj = broj;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }
    public void stampaj () {
        System.out.println("Super kartica");
        System.out.println(this.broj + ", " + this.vlasnik);
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
}

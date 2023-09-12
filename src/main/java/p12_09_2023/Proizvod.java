package p12_09_2023;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private double cena;
    public Proizvod (String naziv, double cena, Kupac kupac) {
        this.naziv = naziv;
        this.cena = cena;
        this.kupac = kupac;
    }
    public double racunajCenu () {
        return this.cena * 1.9 * (100 - this.kupac.getKarta().getPopust()) / 100;
    }
    public void stampaj () {
        System.out.println(this.naziv + " - " + this.racunajCenu() + " dinara.");
        this.kupac.stampaj();
    }
    public void setNaziv (String naziv) {
        this.naziv = naziv;
    }
    public String getNaziv () {
        return this.naziv;
    }
    public void setKupac (Kupac kupac) {
        this.kupac = kupac;
    }
    public Kupac getKupac () {
        return this.kupac;
    }
    public void setCena (double cena) {
        this.cena = cena;
    }
    public double getCena () {
        return this.cena;
    }
}

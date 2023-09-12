package p12_09_2023;

public class Sastojak {
    private String naziv;
    private double cena;

    public Sastojak (String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
    public String getNaziv () {
        return this.naziv;
    }
    public double getCena () {
        return this.cena;
    }

}

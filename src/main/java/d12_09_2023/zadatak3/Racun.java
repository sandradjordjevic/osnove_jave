package d12_09_2023.zadatak3;

public class Racun {
    private String broj;
    private String imePrezime;
    private double trenutnoStanje;
    public Racun (double trenutnoStanje) {
        this.trenutnoStanje = trenutnoStanje;
    }
    public void uplatiNaRacun (double vrednost) {
        this.trenutnoStanje += vrednost;
    }
    public void skiniSaRacuna (double vrednost) {
        this.trenutnoStanje -= vrednost;
    }
    public void stampaj () {
        System.out.println(this.imePrezime + " - " + this.broj);
        System.out.println("Stanje na racunu je " + this.trenutnoStanje + " din.");
    }
    public void setBroj (String broj) {
        this.broj = broj;
    }
    public String getBroj () {
        return this.broj;
    }
    public void setImePrezime (String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getImePrezime () {
        return this.imePrezime;
    }
    public double getTrenutnoStanje () {
        return this.trenutnoStanje;
    }
}

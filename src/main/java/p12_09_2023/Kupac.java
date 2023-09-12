package p12_09_2023;

public class Kupac {
    private String imePrezime;
    private ClanskaKarta karta;

    public Kupac (String imePrezime, ClanskaKarta karta) {
        this.imePrezime = imePrezime;
        this.karta = karta;
    }
    public void stampaj () {
        System.out.println(this.imePrezime + " - " + this.karta.getBroj());
    }
    public void setImePrezime (String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getImePrezime () {
        return this.imePrezime;
    }
    public ClanskaKarta getKarta () {
        return this.karta;
    }
}

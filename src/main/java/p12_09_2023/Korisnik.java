package p12_09_2023;

public class Korisnik {
    private String imePrezime;
    private String tipLicence;
    public Korisnik (String imePrezime) {
        this.imePrezime = imePrezime;
        this.tipLicence = "basic";
    }
    public void pretplata (int uplata) {
        if (uplata == 100) {
            this.tipLicence = "pro";
        }
        if (uplata == 150) {
            this.tipLicence = "premium";
        }
    }
    public void ponistiPretplatu () {
        this.tipLicence = "basic";
    }
    public int vratiMaxDuzinu () {
        int maxDuzina = 0;
        if (this.tipLicence.equals("basic")) {
            maxDuzina = 40;
        }
        if (this.tipLicence.equals("pro")) {
            maxDuzina = 240;
        }
        if (this.tipLicence.equals("premium")) {
            maxDuzina = 1440;
        }
        return maxDuzina;
    }
    public void stampaj () {
        System.out.println(this.imePrezime);
    }
    public String getImePrezime () {
        return this.imePrezime;
    }
    public String getTipLicence () {
        return this.tipLicence;
    }
}

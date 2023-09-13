package d12_09_2023.zadatak1;

public class FizickoLice {
    private String imePrezime;
    private int brojLicneKarte;
    private int jmbg;
    private boolean daLiJeKupovaoNekretnine;

    public FizickoLice (String imePrezime, int brojLicneKarte, int jmbg, boolean daLiJeKupovaoNekretnine) {
        this.imePrezime = imePrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.daLiJeKupovaoNekretnine = daLiJeKupovaoNekretnine;
    }
    public FizickoLice (String imePrezime, int brojLicneKarte, int jmbg) {
        this.imePrezime = imePrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
    }
    public void stampaj () {
        System.out.println(this.imePrezime + ", " + this.brojLicneKarte);
    }
    public String getImePrezime () {
        return this.imePrezime;
    }
    public int getJmbg () {
        return this.jmbg;
    }
    public int getBrojLicneKarte () {
        return this.brojLicneKarte;
    }
    public boolean getDaLiJeKupovaoNekretnine () {
        return this.daLiJeKupovaoNekretnine;
    }

}

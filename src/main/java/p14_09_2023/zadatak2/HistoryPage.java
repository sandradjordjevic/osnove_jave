package p14_09_2023.zadatak2;

public class HistoryPage {
    private String naziv;
    private String link;
    private int sat;
    private int minut;
    private String korisnickoIme;
    private String sifra;

    public HistoryPage(String naziv, String link, int sat, int minut) {
        this.naziv = naziv;
        this.link = link;
        this.sat = sat;
        this.minut = minut;

    }
    public void sacuvajKredencijale (String korisnickoIme, String sifra) {
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
    }
    public void obrisiKolacice () {
        this.korisnickoIme = null;
        this.sifra = null;
    }
    public void stampaj () {
        System.out.print(this.sat + ":" + this.minut + " - " + this.naziv + " " + this.link);
        if (this.naziv != null && this.sifra != null) {
            System.out.println(" *");
        }
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        this.minut = minut;
    }

}

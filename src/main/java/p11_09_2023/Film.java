package p11_09_2023;

public class Film {
    private String naziv;
    private int godina;
    private Reziser reziser;
    public Film () {
    }
    public Film (String naziv, int godina, Reziser reziser) {
        this.naziv = naziv;
        this.godina = godina;
        this.reziser = reziser;
    }
    public void stampaj () {
        System.out.println("Naziv filma: " + this.naziv);
        System.out.println("Godina: " + this.godina);
        System.out.println("Rezirao ga je " + this.reziser.getImePrezime() + " starosti " + this.reziser.getStarost() + " godina.");
    }
    public void setNaziv (String naziv) {
        this.naziv = naziv;
    }
    public String getNaziv () {
        return this.naziv;
    }
    public void setGodina (int godina) {
        this.godina = godina;
    }
    public int getGodina() {
        return this.godina;
    }
}

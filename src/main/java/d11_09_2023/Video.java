package d11_09_2023;

public class Video {
    private String id;
    private String naziv;
    private int duzina;
    private int brojLajkova;
    private int brojDislajkova;
    private int brojPregleda;
    public Video (String id, String naziv, int duzina, int brojLajkova, int brojDislajkova, int brojPregleda) {
        this.id = id;
        this.naziv = naziv;
        this.duzina = duzina;
        this.brojLajkova = brojLajkova;
        this.brojDislajkova = brojDislajkova;
        this.brojPregleda = brojPregleda;
    }
    public void print () {
        System.out.println(this.naziv);
        System.out.println("Likes " + this.brojLajkova + " | Dislikes " + this.brojDislajkova);
        System.out.println(this.brojPregleda + " Pregleda");
    }
    public void lajkuj () {
        this.brojLajkova++;
    }
    public void dislajkuj () {
        this.brojDislajkova++;
    }
    public void pogledaj () {
        this.brojPregleda++;
    }
    public String getId () {
        return this.id;
    }
    public String getNaziv () {
        return this.naziv;
    }
    public int getDuzina () {
        return this.duzina;
    }
    public int getBrojLajkova () {
        return this.brojLajkova;
    }
    public int getBrojDislajkova () {
        return this.brojDislajkova;
    }
    public int getBrojPregleda () {
        return this.brojPregleda;
    }
}

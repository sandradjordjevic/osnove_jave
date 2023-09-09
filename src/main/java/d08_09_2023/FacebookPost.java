package d08_09_2023;

public class FacebookPost {
    public String imeIPrezimeKorisnika;
    public String imeProfila;
    public String tekst;
    public int brojLajkova;
    public int brojDeljenja;
    public void lajkujObjavu () {
        this.brojLajkova++;
    }
    public void dislajkujObajvu () {
        if(this.brojLajkova > 0) {
            this.brojLajkova--;
        }
    }
    public void podeliObjavu () {
        this.brojDeljenja++;
    }
    public void stampaj () {
        System.out.println(this.imeIPrezimeKorisnika + " >>>>> " + this.imeProfila);
        System.out.println(this.tekst);
        System.out.println("Likes " + this.brojLajkova + " | " + " Shares " + this.brojDeljenja);
    }
}

package p14_09_2023.zadatak3;

import java.util.ArrayList;

public class FacebookPost {
    private String korisnikKojiJeStavioPost;
    private String tekst;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String korisnikKojiJeStavioPost, String tekst) {
        this.korisnikKojiJeStavioPost = korisnikKojiJeStavioPost;
        this.tekst = tekst;
        this.reakcije = new ArrayList<>();
    }
    public void reaguj (Reakcija reakcija) {
        this.reakcije.add(reakcija);
    }
    private int brojReakcija (String reakcija) {
        int broj = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTip().equals(reakcija)) {
                broj++;
            }
        }
        return broj;
    }
    public void stampaj () {
        System.out.println(this.korisnikKojiJeStavioPost);
        System.out.println(this.tekst);
        System.out.println("Smile: " + this.brojReakcija("smile") + " | like " + this.brojReakcija("like") + " | heart " + this.brojReakcija("heart"));
    }
}

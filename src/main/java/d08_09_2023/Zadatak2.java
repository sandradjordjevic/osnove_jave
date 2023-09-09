package d08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//        2.Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//        ime i prezime korisnika koji je objavio post
//        ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete
//        da postavite objavu na tudjem profilu)
//        tekst objave
//        broj lajkova
//        broj deljenja
//        Od metoda:
//        like(), koja povecava broj lajkova za 1.
//        dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        share(), koja povecava broj deljenja za 1
//        print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)
//
//        U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

        FacebookPost post1 = new FacebookPost();
        post1.imeIPrezimeKorisnika = "Petar Petrovic";
        post1.imeProfila = "Marko Markovic";
        post1.tekst = "Srecan rodjendan!";
        post1.brojLajkova = 7;
        post1.brojDeljenja = 1;
        post1.lajkujObjavu();
        post1.lajkujObjavu();
        post1.lajkujObjavu();
        post1.dislajkujObajvu();
        post1.podeliObjavu();
        post1.podeliObjavu();
        post1.stampaj();

        FacebookPost post2 = new FacebookPost();
        post2.imeIPrezimeKorisnika = "Marko Markovic";
        post2.imeProfila = "Darko Darkovic";
        post2.tekst = "Hi!";
        post2.brojLajkova = 1;
        post2.brojDeljenja = 1;
        post2.lajkujObjavu();
        post2.lajkujObjavu();
        post2.dislajkujObajvu();
        post2.dislajkujObajvu();
        post2.dislajkujObajvu();
        post2.dislajkujObajvu();
        post2.podeliObjavu();
        post2.stampaj();
    }
}

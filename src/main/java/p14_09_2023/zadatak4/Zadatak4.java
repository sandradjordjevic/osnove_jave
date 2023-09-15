package p14_09_2023.zadatak4;

public class Zadatak4 {
    public static void main(String[] args) {
//        Kreirati klasu InstagramUser koja ima:
//        username
//        Ime i prezime
//        email
//        Sve sto vam dalje zatreba dopunite klasu.
//        Kreiarti klasu InstagramTag koja ima:
//        x koordinatu na slici
//        y koordinatu na slici
//        usera koji je tagovan
//        Kreirati klasu InstagramImage koja ima:
//        niz tagova
//        duzinu slike
//        visinu slike
//        putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//        metodu dodajTag
//
//        Kreirati klasu InstagramPost koja ima
//        niz slika
//        Opis koji moze da se postavi za post
//        metodu dodajSliku

        InstagramUser user1 = new InstagramUser("sandra123", "Sandra Djordjevic", "sandradj@gmail.com");
        InstagramUser user2 = new InstagramUser("petarpet", "Petar Petrovic", "petar5@gmail.com");

        InstagramTag tag1 = new InstagramTag(100, 10, user1);
        InstagramTag tag2 = new InstagramTag(10, 100, user2);

        InstagramImage image1 = new InstagramImage(200, 250, "instagram.com/korsnik-sandra/profilna.jpg");
        InstagramImage image2 = new InstagramImage(300, 250, "instagram.com/korsnik-petar/profilna.jpg");
        image1.addTag(tag1);
        image1.addTag(tag2);
        image2.addTag(tag2);

        InstagramPost post1 = new InstagramPost("Some images");
        post1.addImage(image1);
        post1.addImage(image2);


    }
}

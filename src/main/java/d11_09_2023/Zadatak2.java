package d11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.Zadatak
//        Kreirati klasu Korisnik koja ima
//        ime
//        prezime
//        gettere i settere za ime i prezime
//        konstuktore koje mislite da su vam potrebni
//        metoda koja stampa u formatu:
//        (ime) (prezime)
//
//        Kreirati klasu FacebookPost
//        opis
//        korisnik (referenca na korisnika koji je kreirao post)
//        konstrukore koje mislite da su vam potrebni
//        metoda print, stampa u formatu:
//        (ime) (prezime)
//        (opis post-a)
//
//        U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

        User user1 = new User();
        user1.setFirstName("Petar");
        user1.setLastNameName("Petrovic");
        user1.print();

        FacebookPost facebookPost1 = new FacebookPost("Helooooo world!");
        facebookPost1.setUser(user1);
        facebookPost1.printInfo();

    }
}

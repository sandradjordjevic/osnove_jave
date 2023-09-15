package p14_09_2023.zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {
//        Zadatak
//        Kreirati klasu Reakcija koja ima
//        tip reakcije (smajli, like, srce)
//        ime i prezime korisnika koji je reagovao
//        gettere, settere i konstruktore
//
//        Kreirati klasu FacebookPost koja ima:
//        ime i prezime korisnika koji je stavio oglas
//        tekst objave
//        niz reakcija
//        metodu reaguj, koja dodaje reakciju u niz
//        (modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//        Primer: Milan - lajkuje
//        Nemanja - lajkuje
//        Milan - daje srce
//        Post ima lajk od Nemanje i srce od Milana.
//        privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//
//        brojReakcija(“smajli) => 3
//        brojReakcija(“srce”) => 2
//        brojReakcija(“like”) => 1
//        brojReakcija(“cry”) => 0
//
//
//        metodu stampaj koja stampa podatke u formatu:
//        ime i prezime
//        tekst objave
//        Smajli 10 | Like 15 | Srce 2

        Reakcija r1 = new Reakcija("smile", "Pera Peric");
        Reakcija r2 = new Reakcija("smile", "Mika Peric");
        Reakcija r3 = new Reakcija("like", "Petar Petrovic");
        Reakcija r4 = new Reakcija("heart", "Mika Mikic");

        FacebookPost post1 = new FacebookPost("Milan Milanovic", "Hellooooo!");
        post1.reaguj(r1);
        post1.reaguj(r2);
        post1.reaguj(r3);
        post1.reaguj(r4);
        post1.stampaj();
    }
}

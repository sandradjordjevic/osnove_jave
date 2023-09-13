package d12_09_2023.zadatak3;

import d12_09_2023.zadatak3.Racun;
import d12_09_2023.zadatak3.Transakcija;

public class Zadatak3 {
    public static void main(String[] args) {
//        Zadatak
//        Kreirati klasu Racun koja ima:
//        broj racuna (npr: 170-289328923-23)
//        ime i prezime osobe
//        trenutno stanje na racunu (npr: 100, 1220)
//        gettere i setter za sve atribute, sem settera za stanje na racunu
//        metodu uplatiNaRacun kojoj se dodaje prosledjena vrednost na stanje
//        metodu skiniSaRacunai kojom se stanje umanjuje za prosledjenja vrednost
//        metodu koja stampa podatke o racunu u formatu:
//        Ime i prezime  -  broj racuna
//        stanje na racunu je (trenutno stanje) rsd.
//        Kreirati klasu Transakcija koja ima:
//        id transakcije
//        racun sa kog se prenose sredstva
//        racun na koji se prenose sredstva
//        gettere i settere
//        konstruktore
//        metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//        ako je prenos sredstava manji od 4500, provizija je fiksna 45
//        ako je prenos sredstava veci od 4500, provizija je 1%
//        S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar
//        koji predstavlja visinu transakcije
//        Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//        metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije
//        se unosi vrednost koja se prebacuje.
//        Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi
//        racun dodaje samo (trazena suma).
//        (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//        metodu koja stampa podatke o transakciji u formatu:
//        id transkacije
//        Racun sa: Ime i prezime  -  broj racuna
//        Racun na: Ime i prezime  -  broj racuna
//        Naravno u glavnom kreirati objekte i testirati funkcionalnosti

        Racun racun1 = new Racun(20000);
        racun1.setImePrezime("Laza Lazic");
        racun1.setBroj("123-456789");
        racun1.stampaj();
        racun1.uplatiNaRacun(2000);
        racun1.stampaj();
        racun1.skiniSaRacuna(3000);
        racun1.stampaj();

        Racun racun2 = new Racun(30000);
        racun2.setImePrezime("Petar Petrovic");
        racun2.setBroj("555-1112");

        Transakcija transakcija1 = new Transakcija(123);
        transakcija1.setRacunSaKogSePrenosi(racun1);
        transakcija1.setRacunNaKojiSePrenosi(racun2);

        transakcija1.izvrsiTransakciju(1000);
        racun1.stampaj();
        racun2.stampaj();
        transakcija1.stampaj();



    }
}

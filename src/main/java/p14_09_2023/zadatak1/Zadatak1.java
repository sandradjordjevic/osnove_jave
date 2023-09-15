package p14_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
//        Zadatak
//
//        Kreirati klasu Sastojak koja ima:
//        naziv
//        cenu
//        gettere i settere
//        konstruktore
//        metodu za stampanje koja stampa  podatke u formatu:
//        naziv - cena.din
//
//        Kreirati klasu Pasta koja ima:
//        niz sastojaka
//        metodu za dodavanje sastojka
//        defaultni konstruktor
//        metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//        metodu za stampu koja stampa podatke u formatu:
//        Pasta je sa sastojcima:
//        naziv - cena.din
//        naziv - cena.din
//        naziv - cena.din
//        Cena paste je cena.din
//
//        U glavnom programu kreirati objekte i testirati funkcionalnosti
//
//
//        (ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

        Sastojak s1 = new Sastojak("taljatele", 300);
        Sastojak s2 = new Sastojak("pavlaka", 150);
        Sastojak s3 = new Sastojak("luk", 50);
        s1.stampaj();
        Pasta pasta = new Pasta();
        pasta.dodajSastojak(s1);
        pasta.dodajSastojak(s2);
        pasta.dodajSastojak(s3);
        pasta.stampaj();
        pasta.obrisiSastojak("luk");
        pasta.stampaj();

    }
}

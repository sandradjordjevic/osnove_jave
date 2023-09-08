package d07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//        Zadatak 3: Kreiranje klase "Proizvod"
//        Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
//        U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

        Proizvod p1 = new Proizvod();
        p1.naziv = "Cokolada";
        p1.cena = 150;
        System.out.println(p1.naziv + " - " + p1.cena + " din.");

        Proizvod p2 = new Proizvod();
        p2.naziv = "Hleb";
        p2.cena = 80;
        System.out.println(p2.naziv + " - " + p2.cena + " din.");

        Proizvod p3 = new Proizvod();
        p3.naziv = "Sok";
        p3.cena = 180;
        System.out.println(p3.naziv + " - " + p3.cena + " din.");

    }
}

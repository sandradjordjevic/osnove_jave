package d07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Zadatak 4: Kreiranje klase "Film"
//        Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
//        U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature.
//        Ispisati informacije o filmovima.

        Scanner s = new Scanner(System.in);

        Film f1 = new Film();
        System.out.println("Unesite naslov: ");
        f1.naslov = s.next();
        System.out.println("Unesite godinu izdanja: ");
        f1.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera: ");
        f1.reziser = s.next();
        System.out.println("Film: " + f1.naslov + ", godina izdanja: " + f1.godinaIzdanja + ", reziser: " + f1.reziser);

        Film f2 = new Film();
        System.out.println("Unesite naslov: ");
        f2.naslov = s.next();
        System.out.println("Unesite godinu izdanja: ");
        f2.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera: ");
        f2.reziser = s.next();
        System.out.println("Film: " + f2.naslov + ", godina izdanja: " + f2.godinaIzdanja + ", reziser: " + f2.reziser);

        Film f3 = new Film();
        System.out.println("Unesite naslov: ");
        f3.naslov = s.next();
        System.out.println("Unesite godinu izdanja: ");
        f3.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera: ");
        f3.reziser = s.next();
        System.out.println("Film: " + f3.naslov + ", godina izdanja: " + f3.godinaIzdanja + ", reziser: " + f3.reziser);
    }
}

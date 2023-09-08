package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Zadatak 5: Kreiranje klase "Oprema"
//        Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
//        U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture.
//        Ispisati informacije o opremi.

        Scanner s = new Scanner(System.in);

        Oprema o1 = new Oprema();
        System.out.println("Unesite tip opreme: ");
        o1.tip = s.next();
        System.out.println("Unesite marku opreme: ");
        o1.marka = s.next();
        System.out.println("Unesite cenu opreme: ");
        o1.cena = s.nextDouble();
        System.out.println("Tip opreme: " + o1.tip + ", marka opreme: " + o1.marka + ", cena opreme: " + o1.cena + "$.");

        Oprema o2 = new Oprema();
        System.out.println("Unesite tip opreme: ");
        o2.tip = s.next();
        System.out.println("Unesite marku opreme: ");
        o2.marka = s.next();
        System.out.println("Unesite cenu opreme: ");
        o2.cena = s.nextDouble();
        System.out.println("Tip opreme: " + o2.tip + ", marka opreme: " + o2.marka + ", cena opreme: " + o2.cena + "$.");

        Oprema o3 = new Oprema();
        System.out.println("Unesite tip opreme: ");
        o3.tip = s.next();
        System.out.println("Unesite marku opreme: ");
        o3.marka = s.next();
        System.out.println("Unesite cenu opreme: ");
        o3.cena = s.nextDouble();
        System.out.println("Tip opreme: " + o3.tip + ", marka opreme: " + o3.marka + ", cena opreme: " + o3.cena + "$.");
    }
}

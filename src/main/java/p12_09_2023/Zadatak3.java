package p12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        3.Zadatak
//        Kreirati klasu Sastojak koja ima:
//        naziv sastojka
//        cenu
//        gettere i settere
//        konstuktore
//
//        --U glavnom programu kreirati 3 sastojka.
//        U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
//        Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        ArrayList <Sastojak> sastojci = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println("Unesite naziv sastojka");
            String naziv = s.next();
            System.out.println("Unesite cenu sastojka");
            double cena = s.nextDouble();
            sastojci.add(new Sastojak(naziv, cena));
        }

        for(int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getNaziv() + " - " + sastojci.get(i).getCena() + " dinara.");
        }
    }
}

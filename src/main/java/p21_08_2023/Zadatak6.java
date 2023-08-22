package p21_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        (ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva i
//        od njih formira rezultujuci broj kao na primeru
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 0
//        Unesite broj: 4
//        Unesite broj: 1
//        Rezultujuci broj je 12041 (Promenljiva tipa int)
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int broj = 0;
        for(int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            broj = broj * 10 + s.nextInt();
        }
        System.out.print(broj);
    }
}

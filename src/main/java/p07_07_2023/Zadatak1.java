package p07_07_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //      1.Zad
//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
        Scanner s = new Scanner(System.in);
        Racun r1 = new Racun();
        r1.brojRacuna = "840-23932-323";
        r1.imePrezime = "Sandra Djordjevic";
        r1.stanjeRacuna = 100000.0;

        Racun r2 = new Racun();
        r2.brojRacuna = "830-23955-323";
        r2.imePrezime = "Petar Petrovic";
        r2.stanjeRacuna = 1237;

        System.out.println("Posaljilac: " + r1.imePrezime + ", " + r1.brojRacuna + ", " + r1.stanjeRacuna);
        System.out.println("Primalac: " + r2.imePrezime + ", " + r2.brojRacuna + ", " + r1.stanjeRacuna);
        System.out.println("Unesite sumu za transakciju: ");
        double suma = s.nextDouble();
        r1.stanjeRacuna -= suma;
        r2.stanjeRacuna += suma;
        System.out.println("Posaljilac: " + r1.imePrezime + ", " + r1.brojRacuna + ", " + r1.stanjeRacuna);
        System.out.println("Primalac: " + r2.imePrezime + ", " + r2.brojRacuna + ", " + r2.stanjeRacuna);
    }
}

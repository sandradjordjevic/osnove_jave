package d17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//  1.	Napisati program koji ima informacije koje ucitava informacije sa tastature:
//  ●	Ime
//  ●	Prezime
//  ●	godinu rodjenja
//  I stampa informaicije u formatu:
//  [ime] [prezime] - [startost] god
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();

        System.out.println(ime + " " + prezime + " - " + (2023 - godinaRodjenja) + " god");
    }
}

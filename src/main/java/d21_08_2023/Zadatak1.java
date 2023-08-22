package d21_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//  Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
//  Na kraju programa prikazati sumu.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if(broj % 2 == 0) {
                suma += broj;
            }
        }
        System.out.println("Suma parnih brojeva je: " + suma);
    }
}

package d21_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
    //Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int zbir = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if(broj > 99 && broj < 1000) {
                zbir += broj;
            }
        }
        System.out.println("Zbir trocifrenih brojeva je: " + zbir);
    }
}

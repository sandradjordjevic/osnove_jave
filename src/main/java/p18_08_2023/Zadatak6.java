package p18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati porogram koji od korisnika ucitava dva broja M i N i stampa sve brojeve izmedju M i N.
//        Smatrajte da je M manje od N.
//                Primer izvrsenja:
//        Unesite M: 10
//        Unesite N: 15
//        10, 11, 12, 13, 14, 15,
//                Print da vam bude u jednom redu i sa zarezima!

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj M: ");
        int m = s.nextInt();
        System.out.println("Unesite broj N: ");
        int n = s.nextInt();

        for (int i = m; i <= n; i++) {
            if(i < n) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }


    }
}

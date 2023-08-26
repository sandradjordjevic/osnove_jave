package d25_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
    //    4.	Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        System.out.println("Unesite karakter: ");
        String karakter = s.next();

        stampajKarakter(n, karakter);
    }
    public static void stampajKarakter (int broj, String znak) {
        for(int i = 0; i < broj; i++) {
            System.out.print(znak + " ");
        }
    }
}

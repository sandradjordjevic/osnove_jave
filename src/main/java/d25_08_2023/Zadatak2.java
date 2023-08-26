package d25_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.	Napisati funkciju koja za dva jednocifrena broja
//        koja su ulazni parametri funkcije vraca novu vrednost
//        koja se formira kao na primeru. METODA NISTA NE STAMPA.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int prviBroj = s.nextInt();
        System.out.println("Unesite b: ");
        int drugiBroj = s.nextInt();

        String c = konkateniraj(prviBroj, drugiBroj);
        System.out.println(c);
    }
    public static String konkateniraj (int a, int b) {
        return a + "" + b;
    }
}

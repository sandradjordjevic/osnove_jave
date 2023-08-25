package p25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        6. Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//        Metoda prima broj N i vraca ga sa negativnom vrednoscu.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int negativniBroj = change(n);
        System.out.println(negativniBroj);
    }
    public static int change (int number){
        return (number * -1);
    }
}

package p18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji ucitava broj a i ispisuje poruke:
//        Ukoliko je broj a do 10 stampamo da je jednocifren broj
//        Ukoliko je broj a do 100 stampamo da je dvocifren broj
//        Ukoliko je broj a veci od 100 stampamo da je trocifren.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        if (broj < 10) {
            System.out.println("Broj je jednocifren.");
        } else if (broj >= 10 && broj < 100){
            System.out.println("Broj je dvocifren.");
        } else  {
            System.out.println("Broj je visecifren.");
        }

    }
}

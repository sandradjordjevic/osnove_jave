package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji sabira brojeve koje korisnik unosi,
//        pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);
        int zbir = 0;
        boolean zbirManjiOd100 = false;

        while(!zbirManjiOd100) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if(zbir + broj > 100) {
                System.out.println("Prekoracenje! Sracunata suma je " + zbir + ". ");
                zbirManjiOd100 = true;
            } else {
                zbir += broj;
            }
        }
    }
}

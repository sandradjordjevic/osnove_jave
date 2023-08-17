package d17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//4.Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x za T1: ");
        int xT1 = s.nextInt();

        System.out.println("Unesite y za T1: ");
        int yT1 = s.nextInt();

        System.out.println("Unesite x za T2: ");
        int xT2 = s.nextInt();

        System.out.println("Unesite y za T2: ");
        int yT2 = s.nextInt();

        System.out.println("Unesite x za M: ");
        int xm = s.nextInt();

        System.out.println("Unesite y za M: ");
        int ym = s.nextInt();

        if(xT1 == 10 && yT1 == 100 && xT2 == 100 && yT2 == 0 && xm == 50 && ym == 50) {
            System.out.println("Kliknuto je unutar forme.");
        } else {
            System.out.println("Kliknuto je van forme.");
        }


    }
}

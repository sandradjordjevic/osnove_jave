package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
//        Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:1
//        Unesite broj:0
//        Kraj programa jer je uneto 2 nule.

        Scanner s = new Scanner(System.in);
        boolean krajPrograma = false;
        int brojac = 0;

        while(!krajPrograma) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if(broj == 0) {
                brojac++;
            }
            if(brojac >= 2) {
                krajPrograma = true;
                System.out.println("Kraj programa jer je uneto 2 nule.");
            }
        }
    }
}

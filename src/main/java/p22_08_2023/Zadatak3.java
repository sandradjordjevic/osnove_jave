package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//        Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:2
//        Unesite broj:3
//        Unesite broj:0
//        Unesite broj:5
//        Unesite broj:3
//        Unesite broj:4
//        Kraj programa

        Scanner s = new Scanner(System.in);
        int brojac1 = 0;
        int brojac2 = 0;
        int brojac3 = 0;
        int brojac4 = 0;
        boolean krajPrograma = false;

        while(!krajPrograma) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if(broj == 1) {
                brojac1++;
            }
            if(broj == 2) {
                brojac2++;
            }
            if(broj == 3) {
                brojac3++;
            }
            if(broj == 4) {
                brojac4++;
            }
            if(brojac1 > 0 && brojac2 > 0 && brojac3 > 0 && brojac4 > 0) {
                krajPrograma = true;
                System.out.println("Kraj programa.");
            }
        }
    }
}

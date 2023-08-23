package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//  Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
        Scanner s = new Scanner(System.in);
        boolean krajPrograma = false;
        int brojac2 = 0;
        int brojac1 = 0;

        while(!krajPrograma) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if(broj == 2) {
                brojac2++;
            }
            if(broj == 1) {
                brojac1++;
            }
            if(brojac2 == 2 || brojac1 == 3) {
                krajPrograma = true;
                System.out.println("Kraj programa!");
            }


        }

    }
}

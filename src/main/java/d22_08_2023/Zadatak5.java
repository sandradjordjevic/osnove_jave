package d22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =.
//        Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.

        Scanner s = new Scanner(System.in);
        boolean krajPrograma = false;
        int brojacOtvoreneZagrade = 0;
        int brojacZatvoreneZagrade = 0;

        while(!krajPrograma) {
            System.out.println("Unos: ");
            String unos = s.next();
            if(unos.equals("(")) {
                brojacOtvoreneZagrade++;
            }
            if(unos.equals(")")) {
                brojacZatvoreneZagrade++;
            }
            if(unos.equals("=")) {
                if(brojacOtvoreneZagrade == brojacZatvoreneZagrade) {
                    System.out.println("Zagrade su uparene!");
                } else {
                    System.out.println("Zagrade nisu uparene!");
                }
                krajPrograma = true;
                System.out.println("Kraj programa");
            }
        }

    }
}

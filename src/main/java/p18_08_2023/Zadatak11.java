package p18_08_2023;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
//        (ZA VEZBANJE) Napisati program koji iscrtava timeline na youtube videu.
//        Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu, a program iscrtava timeline tako
//        sto deo koji je pogledan iscrtava zvezdicama a ostatak crticama.
//        Timeline je kontrola koja ima tacno 100 karaktera.
//                Primer izvrsenja:
//        Unesite duzinu videa (s): 203
//        Unesite trenutno vreme videa (s): 20
//*********-------------------------------------------------------------------------------------------
//
//(Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa, zaokruzicemo
// to na 9zvezdica ostatak do 100 su crtice)

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu videa (s): ");
        int duzinaVidea = s.nextInt();
        System.out.println("Unesite trenutno vreme (s): ");
        int trenutnoVreme = s.nextInt();
        int pregladno = (trenutnoVreme * 100) / duzinaVidea;

        for(int i = 0; i <= 100; i++) {
            if(i < pregladno) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
    }
}

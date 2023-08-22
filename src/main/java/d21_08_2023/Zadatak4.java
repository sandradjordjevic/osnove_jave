package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N
//        rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//        smile
//        heart
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj reakcija: ");
        int brojReakcija = s.nextInt();
        int likeBrojac = 0;
        int smileBrojac = 0;
        int heartBrojac = 0;

        for (int i = 0; i < brojReakcija; i++) {
            System.out.println("Unesite reakciju: ");
            String reakcija = s.next();
            if(reakcija.equals("like")) {
                likeBrojac++;
            }
            if(reakcija.equals("smile")) {
                smileBrojac++;
            }
            if(reakcija.equals("heart")) {
                heartBrojac++;
            }
        }
        System.out.println("Summary: like " + likeBrojac + " | " + "smile " + smileBrojac + " | " + "heart " + heartBrojac);
    }
}

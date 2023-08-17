package p17_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
//        Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//        znak karte koja je na stolu
//        broj karte koja je na stolu
//        znak karte koju igrac zeli da odigra
//        broj karte koju igrac zeli da odigra
//        i nakon toga se na ekranu ispisuje da li je potez ispravan. Potez je ispravan ukoliko se karta na stolu i odigrana karta poklapaju po znaku ili broju.

        Scanner s = new Scanner(System.in);
        System.out.println("Znak karte koja je na stolu: ");
        String znakKarteNaStolu = s.next();
        System.out.println("Broj karte koja je na stolu: ");
        int brojKarteNaStolu = s.nextInt();
        System.out.println("Znak karte koju igrac zeli da odigra: ");
        String znakKojiZeli = s.next();
        System.out.println("Broj karte koju igrac zeli da odigra: ");
        int brojKojiZeli = s.nextInt();

        if(znakKarteNaStolu.equals(znakKojiZeli) && brojKarteNaStolu == brojKojiZeli) {
            System.out.println("Potez je validan!");
        } else {
            System.out.println("Potez nije validan!");
        }
    }
}

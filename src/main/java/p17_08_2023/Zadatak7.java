package p17_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
//        Napisati program koji proverava da li je broj telefona validan. Program na pocetku ucitava broj telefona korisnika i ispisuje gresku ukoliko telefon nije validan.
//        Broj nije validan ukoliko nema +381 ili ako ima kosu crtu (/)
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj telefona: ");
        String brojTelefona = s.next();
        if(!brojTelefona.contains("+381") || brojTelefona.contains("/")) {
            System.out.println("Broj nije validan!");
        }
    }
}

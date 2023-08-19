package p18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji sa tastature ucitava broj N i operaciju koja se izvrsava nad njim.
//        Na kraju programa se ispisuje nova vrednost promenljive N.
//Ukoliko se za operaciju unese uvecaj, to uvecava promenljivu N za 1.
//        Ukoliko se za operaciju unese smanji, to smanjuje promenljivu N za 1.


        Scanner s = new Scanner(System.in);

        System.out.println("Unesi broj N: ");
        int n = s.nextInt();
        System.out.println("Unesi operaciju: ");
        String operacija = s.next();
        if (operacija.equals("uvecaj")) {
            n += 1;
        }
        if (operacija.equals("smanji")) {
            n -= 1;
        }
        System.out.println(n);
    }
}

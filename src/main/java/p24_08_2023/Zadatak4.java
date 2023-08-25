package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        4.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//        i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite poziciju: ");
        int index = s.nextInt();
        System.out.println(numbers.get(index));

    }
}

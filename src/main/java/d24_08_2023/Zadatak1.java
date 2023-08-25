package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        1.Zadatak
//        Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
//        i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a position from 0 to 9: ");
        int positionK = s.nextInt();

        System.out.println("Enter a new value: ");
        int newValue = s.nextInt();
        numbers.set(positionK, newValue);
    }
}

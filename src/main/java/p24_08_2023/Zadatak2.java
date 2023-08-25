package p24_08_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//        i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int number = numbers.get(3) * 10;
        numbers.set(3, number);
        System.out.println(numbers);

    }
}

package p24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//        i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int firstNumber = numbers.get(0);
        int lastNumber = numbers.get(numbers.size() - 1);

        numbers.set(0, lastNumber);
        numbers.set(numbers.size() - 1, firstNumber);
        System.out.println(numbers);

    }
}

package p24_08_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
//        1.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//        i prikazuje sumu nultog i zadnjeg elementa tog niza.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int firstNumber = numbers.get(0);
        int lastNumber = numbers.get(numbers.size() - 1);
        int suma = firstNumber + lastNumber;
        System.out.println(suma);



    }
}

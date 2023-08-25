package p24_08_2023;

import java.util.ArrayList;

public class Zadatak5 {
    public static void main(String[] args) {
//        5.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//        i racuna i stampa sumu svih brojeva niza.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int suma = 0;

        for(int i = 0; i < numbers.size(); i++) {
            suma += numbers.get(i);
        }
        System.out.println(suma);

    }
}

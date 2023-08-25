package d24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//        3.Zadatak
//        Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for(int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}

package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
//        9.Zadatak
//        Napisati program koji ucitava N brojeva koje smesta u niz i
//        NA KRAJU programa ih stampa. Potrebne su dve petlje, u jednom se desava ucitavanje niza a u drugoj stampanje.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int number = s.nextInt();
            numbers.add(number);
        }

        System.out.print("Niz je: ");

        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}

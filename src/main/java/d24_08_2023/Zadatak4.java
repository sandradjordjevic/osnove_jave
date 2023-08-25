package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A
//        stampa sve elemente niza koji su veci od nule.

        Scanner s = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = s.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            int number = s.nextInt();
            numbers.add(number);
        }

        System.out.print("The numbers greater than zero in the array numbers are: ");
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > 0) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}

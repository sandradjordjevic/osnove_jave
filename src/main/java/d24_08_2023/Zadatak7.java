package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
//   7. (Za vezbanje) Napisati program koji ucitava niz a duzine N. Nakon unosa niza a,
//   formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//   a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = s.nextInt();

        ArrayList<Integer> arrayA = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number:");
            int numberA = s.nextInt();
            arrayA.add(numberA);
        }

        ArrayList<Integer> arrayB = new ArrayList<>();

        System.out.print("ArrayA: ");
        for (int i = 0; i < arrayA.size(); i++) {
            if(i < 3) {
                arrayB.add(arrayA.get(i));
            } else {
                arrayB.add(1);
            }
            System.out.print(arrayA.get(i) + " ");

        }

        System.out.print("ArrayB: ");
        for (int i = 0; i < arrayB.size(); i++) {
            System.out.print(arrayB.get(i) + " ");
        }

    }
}

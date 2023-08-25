package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.Zadatak
//        Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza,
//        broji koliko je parnih brojeva uneto. brojeve unosi korisnik.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N: ");
        int nNumbers = s.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < nNumbers; i++) {
            System.out.println("Enter a number: ");
            int number = s.nextInt();
            numbers.add(number);
        }

        int evenNumbers = 0;
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println("The number of even numbers in the array is: " + evenNumbers);
    }
}

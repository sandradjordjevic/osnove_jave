package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//   4. Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova
//   niza koji su jednaki broju X.
        Scanner s = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = s.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println("Enter a number");
            int number = s.nextInt();
            numbers.add(number);
        }

        System.out.println("Enter X");
        int x = s.nextInt();

        System.out.print("The elements of the array numbers that are equal to the number X have index: ");
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == x) {
                System.out.print(i + " ");
            }
        }
    }
}

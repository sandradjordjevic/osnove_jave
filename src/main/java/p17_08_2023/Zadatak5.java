package p17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi prvi broj");
        int a = s.nextInt();
        System.out.println("Unesi drugi broj");
        int b = s.nextInt();
        System.out.println("Unesi treci broj");
        int c = s.nextInt();

        if(a >= b && a <= c) {
            System.out.println("Broj a je u opsegu od b do c");
        }

    }
}

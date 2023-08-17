package p17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Napisati program koji ispisuje da li je broj b manji od broja a. A i B unosimo sa tastature.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj a: ");
        int a = s.nextInt();
        System.out.println("Unesite broj b: ");
        int b = s.nextInt();
        if(b < a) {
            System.out.println("Broj b je manji od broja a.");
        }
    }
}

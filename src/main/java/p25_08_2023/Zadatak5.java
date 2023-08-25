package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red..
//        Broj zvezdica je odredjen parametrom N.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite M: ");
        int m = s.nextInt();
        for(int i = 1; i <= m; i++) {
            printStar(i);
        }

    }
    public static void printStar(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }
}

package d17_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #)
//tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
//Hint: Potrebno je da se vrsi konkatanacija nad jednom promenljivom.

        Scanner s = new Scanner(System.in);
        String p = "#";
        System.out.println("Unesite broj a: ");
        int a = s.nextInt();

        System.out.println("Unesite broj b: ");
        int b = s.nextInt();

        System.out.println("Unesite broj c: ");
        int c = s.nextInt();

        System.out.println("Unesite broj d: ");
        int d = s.nextInt();

        if(a > 0) {
            p = p + " " + a;
            if(b > 0) {
                p = p + " " + b;
            } else {
                p = b + " " + p;
            }
            if(c > 0) {
                p = p + " " + c;
            } else {
                p = c + " " + p;
            }
            if(d > 0) {
                p = p + " " + d;
            }  else {
                p = d + " " + p;
            }
            System.out.println(p);
        } else {
            p = a + " " + p;
            if(b > 0) {
                p = p + " " + b;
            } else {
                p = b + " " + p;
            }
            if(c > 0) {
                p = p + " " + c;
            } else {
                p = c + " " + p;
            }
            if(d > 0) {
                p = p + " " + d;
            }  else {
                p = d + " " + p;
            }
            System.out.println(p);
        }
    }
}

package p17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji sa tastature ucitava tri broja a, b i c i ispisuje srednju vrednost za ta tri broja. Sve promenljive u programu su po tipu double
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        double a = s.nextDouble();
        System.out.println("Unesite drugi broj: ");
        double b = s.nextDouble();
        System.out.println("Unesite treci broj: ");
        double c = s.nextDouble();
        double srednjaVrednost = (a + b + c) / 3;
        System.out.println("Srednja vrednost tri broje je: " + srednjaVrednost);


    }
}

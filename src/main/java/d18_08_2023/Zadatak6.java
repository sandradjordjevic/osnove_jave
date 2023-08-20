package d18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dimenziju table: ");
        int dimenzijaTable = s.nextInt();

        for (int i = 1; i < dimenzijaTable; i++) {
            for(int j = 1; j < dimenzijaTable; j++) {
                System.out.print("_|");
            }
            System.out.println("_|");
        }
    }
}

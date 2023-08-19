package p18_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jacinu zvuka: ");
        int jacinaZvuka = s.nextInt();
        String znak = "|";
        if(jacinaZvuka == 0) {
            System.out.println("</");
        } else {
            System.out.print("<");
            for (int i = 0; i < jacinaZvuka; i++) {
                if(i == jacinaZvuka / 2) {
                    System.out.print(" 50% ");
                }
                System.out.print(znak);
            }
        }
    }
}

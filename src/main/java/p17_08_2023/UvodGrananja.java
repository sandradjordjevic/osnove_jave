package p17_08_2023;

import java.util.Scanner;

public class UvodGrananja {
    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
            Scanner s = new Scanner(System.in);
            System.out.println("Unesite x: ");
            int x = s.nextInt();
            System.out.println("Unesite y: ");
            int y = s.nextInt();
            if (x > y) {
                System.out.println("x is greater than y");
            }
        }
    }
}

package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//  Napisati program koji simulira ponasanje jednog test case-a. Test case ima 5 provera, a program validira jednu
//  po jednu proveru sve dok ne proveri sve ili dok neka provera ne failuje.
//  Korisnik sa tastature za svaku proveru unosi expected rec i actual rec. U slucaju fail-a ispisati odgovarajucu poruku.
        Scanner s = new Scanner(System.in);

        int brojProvera = 0;
        boolean provera = false;

        while(!provera && brojProvera < 5) {
            System.out.println("Actual result: ");
            String actual = s.next();
            System.out.println("Expected result: ");
            String expected = s.next();
            if(!actual.equals(expected)){
                provera = true;
                System.out.println("Test je pao.");
            }
            brojProvera++;
            }
        }

    }


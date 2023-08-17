package p17_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji sa tastature ucitava tri cela broja:
//        dan
//                mesec
//        godina
//        I formira datum u ispisu u formatu dan-mesec-godina
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite datum dana: ");
        int dan = s.nextInt();
        System.out.println("Unesite datum meseca: ");
        int mesec = s.nextInt();
        System.out.println("Unesite datum godine: ");
        int godina = s.nextInt();
        System.out.println(dan + "-" + mesec + "-" + godina);

    }
}

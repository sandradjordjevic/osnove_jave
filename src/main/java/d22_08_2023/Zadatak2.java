package d22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu
//        vrednost sve dok se ne unese nula.
        Scanner s = new Scanner(System.in);

        boolean broj0 = false;

        while(!broj0) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if(broj < 0) {
                System.out.println("Apsolutna vrednost je: " + broj * -1);
            } else if(broj > 0) {
                System.out.println("Apsolutna vrednost je: " + broj);
            } else if(broj == 0) {
                broj0 = true;
                System.out.println("Kraj programa jer je uneta 0.");
            }
        }
    }
}

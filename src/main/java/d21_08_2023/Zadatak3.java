package d21_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program
//        ispisuje svaku rec na ekranu tako da zadovolji uslov:
//        ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//        ako se ne sadrzi, program dostampa na kraju
//        Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa !
//        utice na agresivnost.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj reci: ");
        int brojReci = s.nextInt();
        int recSaZnakomUzvika = 0;

        for (int i = 0; i < brojReci; i++) {
            System.out.println("Unesite rec: ");
            String rec = s.next();
            if(!(rec.contains("!"))) {
                String novaRec = rec + "!";
                System.out.println(novaRec);
            } else {
                recSaZnakomUzvika++;
            }
        }
        int nivoAgresivnosti = 100 * recSaZnakomUzvika / brojReci;
        System.out.println("Nivo agresivnosti je " + nivoAgresivnosti + " %.");
    }
}

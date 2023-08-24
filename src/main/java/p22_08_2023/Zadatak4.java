package p22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        (za vezbanje) Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji”
//        ili “play”. Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
//        Pojacaj - akcije koja povecava jacinu zvuka za 10
//        smanji - akcija koja smajnjuje jacinu zvuka za 10.
//        Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//        Na kraju programa odstampati jacinu zvuka.

        Scanner s = new Scanner(System.in);
        int jacinaZvuka = 75;
        boolean krajPrograma = false;

        while(!krajPrograma) {
            System.out.println("Unesite akciju: ");
            String akcija = s.next();
            if(akcija.equals("pojacaj")) {
                if(jacinaZvuka <= 90) {
                    jacinaZvuka += 10;
                } else {
                    jacinaZvuka = 100;
                }
            } else if(akcija.equals("smanji")) {
                if(jacinaZvuka >= 10) {
                    jacinaZvuka -= 10;
                } else {
                    jacinaZvuka = 0;
                }
            } else if (akcija.equals("play")) {
                krajPrograma = true;
                System.out.println("Jacina zvuka: " + jacinaZvuka);
            }
        }
    }
}

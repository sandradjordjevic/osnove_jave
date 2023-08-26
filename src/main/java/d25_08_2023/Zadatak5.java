package d25_08_2023;


import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
//        Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB)
//        a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost: ");
        double vrednost = s.nextDouble();

        System.out.println("Unesite valutu: ");
        String valuta = s.next();

        System.out.println(vrednost + " EUR je " + konvertuj(vrednost, valuta) + " " + valuta);
    }
    public static double konvertuj (double vrednost, String valuta) {
        if(valuta.equals("RSD")) {
            vrednost *= 117.5;
        }
        if(valuta.equals("USD")) {
            vrednost *= 1.1;
        }
        if(valuta.equals("RUB")) {
            vrednost *= 62.98;
        }
        return vrednost;
    }
}

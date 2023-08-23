package d22_08_2023;


import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu
//        ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
        Scanner s = new Scanner(System.in);
        boolean kraj = false;
        String arapskiBroj = "";

        while(!kraj) {
            System.out.println("Unesite rimski broj: ");
            String rimskiBroj = s.next();

                if(rimskiBroj.equals("I")) {
                    arapskiBroj = "1";
                    System.out.println("Arapski broj: " + arapskiBroj);
                }
                if(rimskiBroj.equals("V")) {
                    arapskiBroj = "5";
                    System.out.println("Arapski broj: " + arapskiBroj);
                }
                if(rimskiBroj.equals("X")) {
                    arapskiBroj = "10";
                    System.out.println("Arapski broj: " + arapskiBroj);
                }
                if(rimskiBroj.equals("L")) {
                    arapskiBroj = "50";
                    System.out.println("Arapski broj: " + arapskiBroj);
                }
                if(rimskiBroj.equals("C")) {
                    arapskiBroj = "100";
                    System.out.println("Arapski broj: " + arapskiBroj);
                }
                if(rimskiBroj.equals("D")) {
                    arapskiBroj = "500";
                    System.out.println("Arapski broj: " + arapskiBroj);
                }
                if(rimskiBroj.equals("M")) {
                    arapskiBroj = "1000";
                    System.out.println("Arapski broj: " + arapskiBroj);
                }
                if(rimskiBroj.equals("KRAJ")) {
                    kraj = true;
                    System.out.println("Kraj programa.");
                }
            }
        }
    }


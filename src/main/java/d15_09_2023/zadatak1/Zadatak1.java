package d15_09_2023.zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        1.Zadatak
//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//        jmbg
//        godinu rodjenja
//        default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere
//        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)
//
//        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//        default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere za broj, kapiten i poziciju
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//        Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//        U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i
//        niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik
//        sa tastature.
        Scanner s = new Scanner(System.in);

        ArrayList<Igrac> igraci = new ArrayList<>();
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite ime i prezime igraca: ");
            String imePrezime = s.next();
            System.out.println("Unesite jmbg igraca: ");
            String jmbg = s.next();
            System.out.println("Unesite godinu rodjenja igraca: ");
            int godinaRodjenja = s.nextInt();
            System.out.println("Unesite broj igraca: ");
            int broj = s.nextInt();
            System.out.println("Unesite poziciju igraca: ");
            String pozicija = s.next();
            System.out.println("Da li je igrac kapiten? ");
            boolean kapiten = s.nextBoolean();
            igraci.add(new Igrac(imePrezime, jmbg, godinaRodjenja, broj, pozicija, kapiten));
        }
        for(int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
        }

        ArrayList<Trener> treneri = new ArrayList<>();
        System.out.println("Unesite M: ");
        int m = s.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("Unesite ime i prezime trenera: ");
            String imePrezime = s.next();
            System.out.println("Unesite jmbg trenera: ");
            String jmbg = s.next();
            System.out.println("Unesite godinu rodjenja trenera: ");
            int godinaRodjenja = s.nextInt();
            System.out.println("Unesite godine iskustva: ");
            int godineIskustva = s.nextInt();
            System.out.println("Unesite tip trenera: ");
            String tip = s.next();
            treneri.add(new Trener(imePrezime, jmbg, godinaRodjenja, godineIskustva, tip));
        }
        for(int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
        }

    }
}

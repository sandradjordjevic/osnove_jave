package p18_09_2023.zadatak3;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//        3. Zadatak
//        Kreirati abstraktnu klasu Figura koja ima
//        abstraktnu metodu povrsina
//        abstraktnu metodu obim
//        metodu koja stampa podatke u formatu:
//        Povrsina je (povrsina)
//                Obim je (obim)
//
//        Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//        stranicu a
//        gettere/settere/konstruktore
//        implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//        implementira metodu obim
//
//        Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//        stranice a i b
//        gettere/settere/konstruktore
//        implementira metodu povrsina
//        implementira metodu obim

//        U glavnom programu kreirati niz figura (niz od 3 pravougaonika i 2 trougla).
//        Zatim odstampati na ekranu sve figure i sume njhovih povrsina i obima.



        Figura trougao1 = new JednakostranicniTrougao(3);
        Figura trougao2 = new JednakostranicniTrougao(2);
        trougao1.stampaj();

        Figura pravougaonik1 = new Pravougaonik(2, 3);
        Figura pravougaonik2 = new Pravougaonik(1, 3);
        Figura pravougaonik3 = new Pravougaonik(4, 3);
        pravougaonik1.stampaj();
        ArrayList <Figura> figure = new ArrayList<>();
        figure.add(trougao1);
        figure.add(trougao2);
        figure.add(pravougaonik1);
        figure.add(pravougaonik2);
        figure.add(pravougaonik3);

        double sumaPovrsina = 0, sumaObima = 0;
        for (int i = 0; i < figure.size(); i++) {
            System.out.println("Figura broj: " + i);
            figure.get(i).stampaj();
            System.out.println();
            sumaPovrsina += figure.get(i).povrsina();
            sumaObima += figure.get(i).obim();
        }
        System.out.println("Suma obima svih figura je " + sumaObima);
        System.out.println("Suma povrsina svih figura je " + sumaPovrsina);



    }
}

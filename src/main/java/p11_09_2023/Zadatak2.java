package p11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.Zad
//        Za klasu Tacka, koja ima privatne atribute:
//        x - x koordinata
//        y - y koordinata
//        Javne metode:
//        metodu stampaj
//        imamo difoltni konstruktor
//        imamo konstuktor koji prima obe koordinate za kreiranje objekta
//        geter za x
//        geter za y
//        seter za x
//        seter za y
//
//        U glavnom programu kreirati dva objekta:
//        Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//        Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40

        Tacka xy = new Tacka();
        xy.setX(10);
        xy.setY(20);
        xy.stampaj();

        Tacka xy1 = new Tacka(30, 40);
        xy1.stampaj();

    }
}

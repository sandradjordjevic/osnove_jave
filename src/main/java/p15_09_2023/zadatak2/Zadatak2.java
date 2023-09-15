package p15_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu Osoba koja od atributa ima:
//        ime i prezime
//        jmbg
//        konstuktor sa parametrima
//        metodu stampaj koja stampa podatke u formatu
//        ime prezime, jmbg
//
//
//        Kreirati klasu Student koja nasledjuje klasu Osoba,
//                koja od dodatnih atributa ima:
//        broj indeksa
//        dug za skolarinu
//        konstuktor sa parametrima
//        metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate
//        kao parametar metode.
//        Napisati metod stampajStudenta da stampa sve podatke o studentu
//        Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//        koja od dodatnih atributa ima:
//        naziv predmeta koji predaje
//        iznos plate
//        konstuktor sa parametrima
//        metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//        Napisati metodu stampajProfu da stampa sve podatke o profesoru
//        U glavnom programu kreirati 2 studenta i 2 profesora.

        Student student1 = new Student("Petar Petrovic", "1123456778", 2331, 11000);
        student1.platiSkolarinu(10000);
        student1.stampaj();
        Student student2 = new Student("Djordje Djordjevic", "23041587345", 1122, 15000);


        Profesor profesor1 = new Profesor("Aleksandar Petrovic", "987682837645", "Unutrasnja arhitektura", 100000);
        profesor1.povecajPlatu(10);
        profesor1.stampaj();
        Profesor profesor2 = new Profesor("Mika Mikic", "1122337645", "Metalne konstrukcije", 100000);

        profesor2.stampaj();
    }
}

package p11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//        3.Zadatak
//        Kreirati klasu Film koja ima:
//        naziv filma
//        iz koje godine je film
//        konstruktore, gettere i settere
//        metodu print koja stampa podatke u formatu
//        naziv filma, godina
//
//
//        Kreirati klasu Reziser koja ima:
//        ime i prezime rezisera
//        starost
//        konstruktore, gettere i settere koji su potrebni
//        metodu print koja stampa podatke u formatu
//        ime prezime, starost.god
//
//        U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda


        Reziser reziser1 = new Reziser("Fransis Copola", 84);
        reziser1.stampaj();

        Film film1 = new Film("Kum", 1984, reziser1);
        film1.stampaj();
    }
}

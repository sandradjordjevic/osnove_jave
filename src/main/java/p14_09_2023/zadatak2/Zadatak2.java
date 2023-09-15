package p14_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        //    3.Zadatak(Za vezbanje)
//    Za potrebe google istorije potrebno je kreirati sledece klase.
//    Klasu HistoryPage koja ima:
//    naziv stranice
//    link do stranice
//    vreme otvaranja stranice - sat i minut (2 atributa)
//    username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
//    konstuktore koji su logicni
//    gettere i setter (username i password nemaju settere)
//    metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
//    Metoda obrisi kolacice koja setuje username i password na null.
//    Metoda stampaj koja stampa podatke u formatu:
//    [sat] - [minut] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]
//    Klasu History koja ima:
//    niz stranica koje su posecene
//    metoda otvori stranicu koja dodaje novi historypage u niz.
//    metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//    metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//    metoda obrisi istoriju - metoda brise celu istoriju
//    metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//    metoda pogledajIstoriju - stampa sve posecene stranice
//    metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//    metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena.
//    Metoda kao parametar prima trenutno vreme (sat i minut)

        HistoryPage page1 = new HistoryPage("page1", "page1.com", 13, 11);
        page1.sacuvajKredencijale("Pera Peric", "pera123");
        page1.obrisiKolacice();
        HistoryPage page2 = new HistoryPage("page2", "page2.com", 12, 11);
        page2.sacuvajKredencijale("Mika Mikic", "mika123");
        History pages = new History();
        pages.otvoriStranicu(page1);
        pages.otvoriStranicu(page2);
        pages.pregledajIstoriju();
        pages.obrisiSveKolacice();
        pages.pregledajIstoriju();

    }
}

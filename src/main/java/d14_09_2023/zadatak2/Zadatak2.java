package d14_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
//        2. Zadatak (Za vezbanje)
//        Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama.
//        Znaci nije vam potrebna provera za opseg brojeva.
//
//        Za potrebe Lotto igre na srecu potrebno je
//        Kreirati klasu Kombinacija koja ima:
//        id kombinacije (String)
//                niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//        konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//        gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//        metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//                Zaglavlje metode je:
//        public boolean daLiJeIstaKombinacija( Kombinacija k)
//        metoda vraca true ako su svi elementi na istim pozicija isti
//        npr: this [0] == k [0], this [1] == k [1] ….
//        metodu za stampu koja stampa podatke u formatu
//        ID: id kombinacije
//        brojevi: 1, 3, 5, 14, 15, 21, 23
//
//
//        Kreirati klasu Listic koja ima:
//        niz kombinacija - maksimalno 7 kombinacija
//        metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//        metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru.
//        Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija.
//        Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//        Zaglavlje metode
//        public boolean dobitna(Kombinacija dobitnaKombinacija)
//        metodu koja stampa listic u formatu
//        ID: id kombinacije
//        brojevi: 1, 3, 5, 14, 15, 21, 23
//
//        ID: id kombinacije
//        brojevi: 1, 3, 5, 14, 15, 21, 23
//
//……       i tako za sve kombinacije

        Kombinacija k1 = new Kombinacija("k1", 22, 5, 10, 13, 24, 33, 39);
        Kombinacija k2 = new Kombinacija("k2", 2, 15, 1, 23, 24, 33, 39);
        Kombinacija k3 = new Kombinacija("k3", 1, 2, 3, 4, 5, 7, 6);
        Kombinacija k4 = new Kombinacija("k4", 21, 35, 12, 33, 14, 13, 29);
        Kombinacija k5 = new Kombinacija("k5", 19, 1, 12, 23, 3, 9, 34);
        Kombinacija k6 = new Kombinacija("k6", 8, 15, 1, 23, 24, 33, 39);
        Kombinacija dobitna = new Kombinacija("dobitna", 28, 15, 1, 23, 24, 33, 39);
        System.out.println(k1.daLiJeIstaKombinacija(k2));

        Listic listic = new Listic();
        listic.dodajKombinaciju(k1);
        listic.dodajKombinaciju(k2);
        listic.dodajKombinaciju(k3);
        listic.dodajKombinaciju(k4);
        listic.dodajKombinaciju(k5);
        listic.dodajKombinaciju(k6);
        System.out.println(listic.daLiJeDobitna(dobitna));
        if (listic.daLiJeDobitna(dobitna)) {
            System.out.println("U listicu postoji kombinacija koja je dobitna!");
        } else {
            System.out.println("Ne postoji dobitna kombinacija!");
        }
        listic.stampaj();
    }
}

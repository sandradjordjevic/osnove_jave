package d25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]

        stampajPodatke(1233456779, "Sandra", "Djordjevic", 1997, true);

    }
    public static void stampajPodatke (int jmbg, String ime, String prezime, int godinaRodjena, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjena);
        System.out.println("Aktivan: " + aktivan);
    }
}

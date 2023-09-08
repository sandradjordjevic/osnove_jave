package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.  Zadatak
//        Kreirati klasu Auto koja ima:
//        ime i prezime vozaca
//        marku automobila
//        broj vrata
//        potrosnju na 100km (npr: 3.6 litra)
//        trenutnu brzinu kojom se auto krece
//        metodu za stampu koja stampa podatke u formatu:
//        [Vozac]
//	      [Marka] - [br vrata]-ro vrata
//        Sa potrosnjom od [potrosnja] l na 100km
//        [Trenutna brzina auta] km/h je trenutna brzina.

        Auto auto1 = new Auto();
        auto1.vozac = "Petar Petrovic";
        auto1.brojVrata = 5;
        auto1.marka = "Mercedes";
        auto1.potrosnjaNa100 = 10;
        auto1.trenutnaBrzina = 150;
        auto1.godinaProizvodnje = 2015;
        auto1.mesecRegistracije = 5;
        auto1.kubikaza = 3000;
        auto1.brojRegistracije = "LE123-HT";
        auto1.daLiJeUkljucenaKlima = false;
        auto1.maxBrzina = 240;
        auto1.stampaj();
        if(auto1.prekoracenjeBrzine(130)) {
            System.out.println("Prekoracio je brzinu.");
            System.out.println("Novcana kazna je " + auto1.novcanaKazna(130) + " din.");
        } else {
            System.out.println("Nije prekoracio brzinu.");
        }
        if(auto1.daLiJeOldtajmer()) {
            System.out.println("Auto je oldtajmer.");
        } else {
            System.out.println("Auto nije oldtajmer.");
        }
        if(auto1.daLiJeIsteklaRegistracija(6)) {
            System.out.println("Registracija je istekla.");
        } else {
            System.out.println("Registracija nije istekla.");
        }
        double cenaRegistracije = auto1.cenaRegistracije();
        System.out.println("Cena registracije je " + cenaRegistracije + "din.");
        auto1.dodajGas();
        auto1.dodajGas();
        auto1.dodajGas();
        System.out.println("Trenutna brzina je " + auto1.trenutnaBrzina + "km/h.");
        auto1.koci();
        System.out.println("Trenutna brzina je " + auto1.trenutnaBrzina + "km/h.");
        System.out.println("Trenutna potrosnja automobila je " + auto1.trenutnaPotrosnja());
        auto1.stampajTablu();
    }
}

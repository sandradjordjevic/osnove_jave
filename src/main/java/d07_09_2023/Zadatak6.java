package d07_09_2023;

public class Zadatak6 {
    public static void main(String[] args) {
//        Zadatak 6: (za vezbanje ali topla prepuka svakom): Upravljanje Flotom Vozila - Rešite Poslovni Problem
//        Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem.
//        Radite za kompaniju za dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila.
//        Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
//        Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave.
//        Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.
//                **Scenario:**
//        Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku,
//        model, registarski broj i godinu proizvodnje. Vozači su takođe deo flote i svaki vozač ima svoje lične
//        informacije, uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
//        Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište,
//        dužinu rute (u kilometrima) i očekivano vreme putovanja.
//        Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli
//        kompaniji da optimizuje svoje poslovanje.
//        Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem
//        upravljanja vozilima, vozačima, rutama i dostavama. Kreirajte klase sa odgovarajućim atributima
//        kako biste omogućili upravljanje ovim resursima i u glavnom programu kreirajte objekte.

        Vozac vozac1 = new Vozac();
        vozac1.ime = "Pera";
        vozac1.prezime = "Peric";
        vozac1.brojVozacke = 123456;
        vozac1.jmbg = "1234567891";
        vozac1.datumIstekaDozvole = "1.1.2024.";

        Vozilo vozilo1 = new Vozilo();
        vozilo1.marka = "Ford";
        vozilo1.model = "Transit";
        vozilo1.godinaProizvodnje = 2015;
        vozilo1.registarskiBroj = "LE111-222";

        Ruta ruta1 = new Ruta();
        ruta1.polaznaTacka = "Leskovac";
        ruta1.odrediste = "Nis";
        ruta1.duzina = 42.6;
        ruta1.vremePutovanja = 46;

        Posiljka posiljka1 = new Posiljka();
        posiljka1.dostavljac = vozac1.ime + " " + vozac1.prezime;
        posiljka1.vozilo = vozilo1.marka + " " + vozilo1.model;
        posiljka1.id = 11111;
        posiljka1.ruta = ruta1.polaznaTacka + " - " + ruta1.odrediste;
        posiljka1.status = "Isporuceno";

        System.out.println("Pracenje posiljke");
        System.out.println("Broj posiljke: " + posiljka1.id);
        System.out.println("Ime dostavljaca: " + posiljka1.dostavljac);
        System.out.println("Vozilo dostave: " + posiljka1.vozilo);
        System.out.println("Ruta posiljke: " + posiljka1.ruta);
        System.out.println("Status posiljke: " + posiljka1.status);
    }
}

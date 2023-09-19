package p19_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
//        Zadatak 2. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//        ime i prezime privatni
//        i rezultat ostvaren na takmičenju koji je zasticen
//        Javne metode klase su:
//        apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara
//        (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//        metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//        Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat,
//        a kod skakača veći.
//        Kreirati i klasu Disciplina čiji su privatni atributi:
//        ime discipline
//        tip discipline (Trkacka ili Skakacka)
//        niz atletičara koji učestvuju u toj disciplini.
//        U javnom delu klase definisati:
//        konstuktore, gettere i settere
//        konstruktor koji postavlja ime discipline i tip
//        metodu dodaj atleticara u disciplinu
//        metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//        (za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
//        (za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//        U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
//        (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

        Trkac trkac1 = new Trkac("Pera Peric", 100);
        Trkac trkac2 = new Trkac("Mika Mikic", 50);

        Skakac skakac1 = new Skakac("Djordje Djordjevic", 5);
        Skakac skakac2 = new Skakac("Petar Petrovic", 7.3);

        Disciplina disciplina = new Disciplina("Skok u dalj", "Trkacka");
        disciplina.dodajAtleticara(skakac1);
        disciplina.dodajAtleticara(skakac2);
        disciplina.stampaj();

        Disciplina disciplina2 = new Disciplina("100m sa preponama", "Skakacka");
        disciplina2.dodajAtleticara(trkac1);
        disciplina2.dodajAtleticara(trkac2);
        disciplina2.stampaj();


    }
}

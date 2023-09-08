package p08_09_2023;

import p07_07_2023.SlackMessage;

public class Zadatak1 {
    public static void main(String[] args) {
//        Krairti klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        (dopuna) kreirati metodu za stampu koja stampa podatke u formatu
//      [ime i prezime osobe] - [kad je poslata]
//      [Tekst poruke]
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke
//        (Dopuna)
//        Dopuniti klasu SlackMessage novim atributom koji kaze kada je poruka azurirana i
//        kreirati metodu za azuriranje teksta. Metoda kao parametar prima novi tekst i datum kada je
//        poruka azurirana. Metoda postavlja novi tekst i datum azuriranja u objektu.


        SlackMess m1 = new SlackMess();
        m1.tekstPoruke = "Hi!";
        m1.imePrezime = "Pera Peric";
        m1.datumVreme = "26.08.2021 18:55";
        m1.stampaj();
        m1.azuriranjeDatumVreme = "26.08.2021 19:30";
        m1.azuriraj("Hello world!", m1.azuriranjeDatumVreme);
        m1.stampaj();


        SlackMess m2 = new SlackMess();
        m2.tekstPoruke = "Hello!";
        m2.imePrezime = "Zika Zikic";
        m2.datumVreme = "26.08.2021 19:00";
        m2.stampaj();
        m2.azuriranjeDatumVreme = "26.08.2021 19:35";
        m2.azuriraj("Helloooooo!", m2.azuriranjeDatumVreme);
        m2.stampaj();
    }
}

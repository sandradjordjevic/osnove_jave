package p07_07_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.Zad
//        Krairti klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//         [ime i prezime osobe] - [kad je poslata]
//         [Tekst poruke]

        SlackMessage m1 = new SlackMessage();
        m1.tekstPoruke = "Hi!";
        m1.imePrezime = "Pera Peric";
        m1.datumVreme = "26.08.2021 18:55";
        System.out.println(m1.imePrezime + " - " + m1.datumVreme);
        System.out.println(m1.tekstPoruke);

        SlackMessage m2 = new SlackMessage();
        m2.tekstPoruke = "Hello!";
        m2.imePrezime = "Zika Zikic";
        m2.datumVreme = "26.08.2021 19:00";
        System.out.println(m2.imePrezime + " - " + m2.datumVreme);
        System.out.println(m2.tekstPoruke);

    }
}

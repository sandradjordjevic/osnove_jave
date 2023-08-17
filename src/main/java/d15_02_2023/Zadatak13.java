package d15_02_2023;

public class Zadatak13 {
    public static void main(String[] args) {
//        Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se baterija na telefonu napuni do 100%. Program od informacija cuva:
//        Naziv telefona
//        Kapacitet baterije u mAh (miliamper sat)
//        Trenutna napunjenost baterije u % (procentima)
//        Struja punjenja u mA (miliamper)
//        Teorijski: Struja punjenja nam kaze koliko se miliampera napuni za 1h punjenja.
//        Primer izvrsenja:
//        Iphone 11 pro max
//        Kapacitet baterije: 3000mAh
//        Baterija trenutno na 20%
//        Struja punjenja 1000mA
//        Procenjeno vreme punjenja je 2.4h.
        String nazivTelefona = "Iphone 11 pro max";
        int kapacitetBaterije = 3000;
        int baterijaProcenti = 20;
        int strujaPunjenja = 1000;
        double procenjenoVremePunjenja =(kapacitetBaterije / strujaPunjenja) - ( 1.0 * (kapacitetBaterije / strujaPunjenja) * baterijaProcenti / 100);
        System.out.println(nazivTelefona);
        System.out.println("Kapacitet baterije: " + kapacitetBaterije + "mAh");
        System.out.println("Baterija trenutno na: " + baterijaProcenti + "%");
        System.out.println("Struja punjenja: " + strujaPunjenja + "mAh");
        System.out.println("Procenjeno vreme punjenja: " + procenjenoVremePunjenja + "h");
    }
}

package d15_02_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.	Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici. Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice. Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
//        Napomena: svaka informacija mora da bude u okviru posebne promenljive.

        String cardNumber = "1234 2341 3412 4123";
        String date = "10/25";
        String cardHolder = "Sandra Djordjevic";
        System.out.println("****************************************");
        System.out.println("*    Credit Card                       *");
        System.out.println("*    ****                              *");
        System.out.println("*    ****                              *");
        System.out.println("*    " + cardNumber + "                *");
        System.out.println("*                 valid > " + date + " *");
        System.out.println("*                                      *");
        System.out.println("*   " + cardHolder + "                 *");
        System.out.println("****************************************");

    }
}

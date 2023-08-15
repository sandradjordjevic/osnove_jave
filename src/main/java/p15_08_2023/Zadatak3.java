package p15_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//        [IME I PREZIME]
//        [BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//        [EMAIL]

        String imePrezime = "Sandra Djordjevic";
        String brojTelefona = "+381641815867";
        String ulicaBroj = "Generala Milojka Lesjanina 65a";
        String grad = "Nis";
        String email = "sandradj2331@gmail.com";

        System.out.println("Ime i prezime: " + imePrezime);
        System.out.println("Broj telefona: " + brojTelefona + " " + "ulica i broj: " + ulicaBroj + " " + "grad: " + grad );
        System.out.println("Email: " + email);

    }
}

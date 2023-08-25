package p25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju
//        sa razlicitim prosledjenim vrednostima.
        izracunaj(2, 3);
        izracunaj(10, 5);
        izracunaj(22, 3);

    }
    public static void izracunaj (int a, int b) {
        int zbir = a + b;
        System.out.println("Zbir je: " + zbir);
        int razlika = a - b;
        System.out.println("Razlika je: " + razlika);
        int proizvod = a * b;
        System.out.println("Proizvod je: " + proizvod);
        int kolicnik = a / b;
        System.out.println("Kolicnik je: " + kolicnik);
    }
}

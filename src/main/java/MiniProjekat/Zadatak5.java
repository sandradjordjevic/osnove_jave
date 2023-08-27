package MiniProjekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//  5.	**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//  Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći
//  link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi
//  generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//  Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda,
//  a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju
//  različitih metoda za generisanje karaktera i passworda.
//  ●	generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa
//  elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima).
//  Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//  ●	generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi
//  niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan
//  element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//  Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the password length: ");
        int passwordLength = s.nextInt();

        System.out.println("Do you want the password to contain a special character: ");
        boolean wantASpecialCharacter = s.nextBoolean();

        System.out.println("Generated password: " + generateAPassword(passwordLength, wantASpecialCharacter));

    }
    public static String generateARandomCharacter () {
        ArrayList<String> randomCharacters = new ArrayList<>();
        randomCharacters.add("A"); randomCharacters.add("a");
        randomCharacters.add("B"); randomCharacters.add("b");
        randomCharacters.add("C"); randomCharacters.add("c");
        randomCharacters.add("D"); randomCharacters.add("d");
        randomCharacters.add("E"); randomCharacters.add("e");
        randomCharacters.add("F"); randomCharacters.add("f");
        randomCharacters.add("G"); randomCharacters.add("g");
        randomCharacters.add("H"); randomCharacters.add("h");
        randomCharacters.add("I"); randomCharacters.add("i");
        randomCharacters.add("J"); randomCharacters.add("j");
        randomCharacters.add("K"); randomCharacters.add("k");
        randomCharacters.add("L"); randomCharacters.add("l");
        randomCharacters.add("M"); randomCharacters.add("m");
        randomCharacters.add("N"); randomCharacters.add("n");
        randomCharacters.add("O"); randomCharacters.add("o");
        randomCharacters.add("P"); randomCharacters.add("p");
        randomCharacters.add("R"); randomCharacters.add("r");
        randomCharacters.add("S"); randomCharacters.add("s");
        randomCharacters.add("T"); randomCharacters.add("t");
        randomCharacters.add("U"); randomCharacters.add("u");
        randomCharacters.add("V"); randomCharacters.add("v");
        randomCharacters.add("W"); randomCharacters.add("w");
        randomCharacters.add("X"); randomCharacters.add("x");
        randomCharacters.add("Y"); randomCharacters.add("y");
        randomCharacters.add("Z"); randomCharacters.add("z");
        randomCharacters.add("1"); randomCharacters.add("2");
        randomCharacters.add("3"); randomCharacters.add("4");
        randomCharacters.add("5"); randomCharacters.add("6");
        randomCharacters.add("7"); randomCharacters.add("8");
        randomCharacters.add("9"); randomCharacters.add("10");
        Random random = new Random();
        int randomNumber = random.nextInt(randomCharacters.size() - 1);
        return randomCharacters.get(randomNumber);
    }
    public static String generateASpecialCharacter () {
        ArrayList<String> specialCharacters = new ArrayList<>();
        specialCharacters.add("@");
        specialCharacters.add("#");
        specialCharacters.add("&");
        specialCharacters.add("*");
        specialCharacters.add("!");
        Random random = new Random();
        int randomNumber = random.nextInt(specialCharacters.size() - 1);
        return specialCharacters.get(randomNumber);
    }
    public static String generateAPassword (int length, boolean wantASpecialCharacter) {
        String password = "";
        for (int i = 0; i < length - 1; i++) {
            password += generateARandomCharacter();
        }
        if(wantASpecialCharacter) {
            password += generateASpecialCharacter();
        }
        return password;
    }

}

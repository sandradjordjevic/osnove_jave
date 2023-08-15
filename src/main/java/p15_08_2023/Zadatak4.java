package p15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        //        Napisati program koji na ekranu stampa podatke u formatu:
        //        Sifra [SIFRA PROIZVODA]
        //        [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
        //        [BOJA], [VELICINA]

        String sifra = "x932k20";
        String nazivProizvoda = "Nike Patike";
        int cena = 90;
        double popust = 13.5;
        String boja = "Crna";
        double velicina = 46.5;

        System.out.println("Sifra " + sifra);
        System.out.println(nazivProizvoda + " - $"  + cena + " - Popust" +  + popust + " %");
        System.out.println(boja + ", " + velicina);
    }
}

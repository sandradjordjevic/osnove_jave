package d15_02_2023;

public class Zadatak12 {
    public static void main(String[] args) {
//        Napisati program za promenu velicine slike na osnovu cuvanih podataka. Program cuva sledece informacije:
//        Naziv slike
//        Rezoluciju (duzina i visina)
//        Faktor skaliranja
//        Na osnovu faktora skaliranja, program će odluciti hoce li sliku smanjiti ili povecati.
//        Evo teorijskih primera za faktor skaliranja:
//        ako je originalna slika 1920x1080, a faktor skaliranja 0.8, slika ce se smanjiti za 20% i rezolucija ce postati 1536x864.
//        S druge strane, ako je faktor skaliranja 1.3, slika ce se povecati za 30% i rezolucija ce postati 2496x1404.
//        Na kraju programa, prikazati velicinu svake slike u megabajtima (MB). Naziv nove slike se dobija dodavanjem prefiksa "resized-" originalnom nazivu.

        String file = "profile-image.log";
        int length = 1920;
        int height = 1080;
        int resolution = length * height;
        int kb = resolution / 1024;
        double mb = (1.0 * kb) / 1024;
        double scaleFactor = 0.8;
        double scale = (1.0 - scaleFactor) * 100;
        double resizedLength = length - (length * scale / 100);
        double resizedHeight = height - (height * scale / 100);
        double resizedResolution = resizedHeight * resizedLength;
        double resizedkb = resizedResolution / 1024;
        double resizedmb = resizedkb / 1024;

        System.out.println("Original image: " + file + " Size: " + mb + "Mb");
        System.out.println("Scale: " + scaleFactor);
        System.out.println("Resized image: resized-" + file + " Size: " + resizedmb +"Mb");
        System.out.println("| Click here to Download image |");

    }
}

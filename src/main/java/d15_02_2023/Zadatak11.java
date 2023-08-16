package d15_02_2023;

public class Zadatak11 {
    public static void main(String[] args) {
//        Napisati program koji izracunava velicinu slike na temelju dostupnih podataka. Program cuva sledece informacije o slici:
//        Naziv slike
//        Rezoluciju (duzina i visina)
//        Na osnovu rezolucije, program racuna ukupan broj piksela u slici. Svaki piksel zauzima 1b (bajt).
        String file = "profile-image.log";
        int length = 1920;
        int height = 1080;
        int resolution = length * height;
        int kb = resolution / 1024;
        double mb = (1.0 * kb) / 1024;
        System.out.println("File: " + file);
        System.out.println("Resolution: " + length + "x" + height);
        System.out.println("Size (kb): " + kb);
        System.out.println("Size (Mb): " + mb);
    }
}

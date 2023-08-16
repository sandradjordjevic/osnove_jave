package d15_02_2023;

public class Zadatak8 {
    public static void main(String[] args) {
//        (Za vezbanje)
//        Napisati program koji za datu boju trazi kontrastnu boju. Svaka boja se sadrzi od 3 komponente RGB(red, green, blue).
//        Svaka komponenta boje je u opsegu od 0 do 255(informativno)
//                Program nalazi kontrastnu boju tako sto svaku komponentu boje oduzme od 255.
//        Primer izvrsenja:
//        Originalna boja: RGB(140, 12,  100)
//        Kontrastna boja: RGB(115, 243, 155)
        int red = 140;
        int green = 12;
        int blue = 100;
        System.out.println("Originalna boja: RGB(" + red + ", " + green + ", " + blue + ")");
        System.out.println("Kontrastna boja: RGB(" + (255 - red) + ", " + (255 - green) + ", " + (255 - blue) + ")");
    }
}

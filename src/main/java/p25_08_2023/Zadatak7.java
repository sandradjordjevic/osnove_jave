package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
//        7. Napisati metodu koja proverava da li je trougao pravougli.
//        Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.

        boolean provera = proveri(2, 3, 5);
        if(provera) {
            System.out.println("Trougao je pravougli.");
        } else {
            System.out.println("Trougrao nije pravougli.");
        }
    }
    public static Boolean proveri (int a, int b, int c) {
        if(a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }
}

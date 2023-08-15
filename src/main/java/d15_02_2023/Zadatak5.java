package d15_02_2023;

public class Zadatak5 {
    public static void main(String[] args) {
        // 5.	 Napisati program koji racuna i ispisuje povrsinu i obim trougla.
        // KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
        int stranicaTrougla = 10;
        double KONSTANTA_KORENBROJA3 = 1.73;
        int obimTrougla = stranicaTrougla * 3;
        double povrsinaTrougla = (stranicaTrougla * stranicaTrougla * KONSTANTA_KORENBROJA3) / 4;
        System.out.println("Obim trougla: " + obimTrougla + "cm");
        System.out.println("Povrsina trougla: " + povrsinaTrougla + "cm2");
    }
}

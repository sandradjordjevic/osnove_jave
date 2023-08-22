package p21_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//        Izvrsenje:
//        2 na stepen 7 je 128
//        HINT
//                P = 2 * 2 * 2 * 2 * 2 * 2 * 2
        int s = 1;
        int osnova = 2;
        int stepen = 7;
        for(int i = 0; i < stepen; i++) {
            s *= osnova;
        }
        System.out.println(s);

    }
}

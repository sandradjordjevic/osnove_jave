package d25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
//        7.	Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        System.out.println(najmanjiBroj(1, 2, 3));
        System.out.println(najmanjiBroj(100, 2000, 3));
    }
    public static int najmanjiBroj (int a, int b, int c) {
        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        return min;
    }
}

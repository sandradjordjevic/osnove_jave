package d25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {
        // 6.	Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.

        System.out.println("Izmedju N i M ima celih " + prebroj(5,10) + " brojeva.");
        System.out.println("Izmedju N i M ima celih " + prebroj(-5,1) + " brojeva.");
    }
    public static int prebroj (int n, int m) {
        int brojac = 0;
        for(int i = n; i < m - 1; i++) {
            brojac++;
        }
        return brojac;
    }
}

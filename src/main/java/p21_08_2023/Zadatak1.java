package p21_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje
        int suma = 0;
        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println(suma);
    }
}

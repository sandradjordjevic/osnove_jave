package p18_08_2023;

public class Zadatak9 {
    public static void main(String[] args) {
        //Napisati program koji ispisuje SAMO PARNE brojeve od 1 do 100
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

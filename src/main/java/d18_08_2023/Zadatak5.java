package d18_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {
//5.	Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//●	sve parne stampa kao negativne
//●	sve neprane kao pozitivne brojeve

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.print("-" + i + " ");
            }
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}

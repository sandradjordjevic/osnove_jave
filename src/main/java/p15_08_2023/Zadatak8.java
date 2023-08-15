package p15_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {
//        Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
//        Primer izvrsenja:
//        a: 5
//        Povrsina kvadrata je 25
//        r: 3
//        Povrsina kruga je 28.26
        double stranicaKvadrata = 5.0;
        double poluprecnikKruga = 3.0;
        double PI = 3.14;
        double povrsinaKruga = poluprecnikKruga * poluprecnikKruga * PI;
        double povrsinaKvadrata = stranicaKvadrata * stranicaKvadrata;

        System.out.println("Povrsina kvadrata:" + povrsinaKvadrata);
        System.out.println("Povrsina kruga: " + povrsinaKruga);

    }
}

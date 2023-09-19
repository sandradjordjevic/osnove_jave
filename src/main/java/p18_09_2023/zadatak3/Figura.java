package p18_09_2023.zadatak3;

public abstract class Figura {
    public Figura() {
    }
    public abstract double povrsina ();
    public abstract double obim ();
    public void stampaj () {
        System.out.println("Povrsina je: " + povrsina());
        System.out.println("Obim je: " + obim());
    }
}

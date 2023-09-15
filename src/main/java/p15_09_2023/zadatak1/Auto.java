package p15_09_2023.zadatak1;

public class Auto extends Vozilo {

    private int brojVrata;


    public Auto() {
    }

    public void stampaj () {
        System.out.println(this.registracija);
        System.out.println(this.marka);
        System.out.println(this.brzina);
        System.out.println(this.brojVrata);
    }
    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }
}

package d18_09_2023.zadatak1;

public class VideoPlayer {
    private int duzina;
    private int trenutnoVreme;
    private int jacina;
    private int kvalitet;
    public VideoPlayer(int duzina, int trenutnoVreme, int jacina, int kvalitet) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.jacina = jacina;
        this.kvalitet = kvalitet;
    }
    public void stampaj () {
        System.out.println("Trenutno vreme: " + this.trenutnoVreme);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Kvalitet: " + this.kvalitet);
    }

    public int getDuzina() {
        return duzina;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public int getJacina() {
        return jacina;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public void setJacina(int jacina) {
        this.jacina = jacina;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }
}

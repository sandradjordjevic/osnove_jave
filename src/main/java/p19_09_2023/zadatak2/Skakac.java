package p19_09_2023.zadatak2;

public class Skakac extends Atleticar {
    public Skakac(String ime, double rezultat) {
        super(ime, rezultat);
    }
    @Override
    public boolean daLiJeRezultatBolji (Atleticar atleticar) {
        return this.rezultat > atleticar.getRezultat();
    }
}

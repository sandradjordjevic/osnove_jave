package d12_09_2023.zadatak4;

public class Zadatak4 {
    public static void main(String[] args) {
        Ringla doleLevo = new Ringla("obicna", 0.8);
        Ringla doleDesno = new Ringla("obicna", 0.8);
        Ringla goreLevo = new Ringla("expres", 1);
        Ringla goreDesno = new Ringla("expres", 1);

        ElektricniSporet sporet1 = new ElektricniSporet("Bosh", 2, 2, goreLevo, goreDesno, doleLevo, doleDesno);
        sporet1.pojacaj(1);
        sporet1.pojacaj(2);
        sporet1.pojacaj(2);
        sporet1.pojacaj(2);
        sporet1.iskljuci(2);
        System.out.println(sporet1.ukupnaPotrosnja(2));
        sporet1.stampaj();
    }
}

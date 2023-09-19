package d19_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        Planina planina = new Planina("Golija", "Srbija", 1833);

        RekreativniPlaninar rekreativac1 = new RekreativniPlaninar(10, "Petar Petrovic", 20, "Jablanicki", 2000);
        RekreativniPlaninar rekreativac2 = new RekreativniPlaninar(2, "Milan Milanovic", 10, "Jablanicki", 3000);
        RekreativniPlaninar rekreativac3 = new RekreativniPlaninar(11, "Mika Mikic", 15, "Jablanicki", 4500);
        System.out.println(rekreativac1.uspesanUspon(planina));

        Alpinista alpinista1 = new Alpinista(3, "Djordje Djordjevic", 20);
        Alpinista alpinista2 = new Alpinista(6, "Marko Markovic", 50);
        Alpinista alpinista3 = new Alpinista(9, "Darko Darkovic", 35);
        alpinista1.stampaj();

        PlaninarskiDom dom = new PlaninarskiDom("Planinarski dom", 2000);
        dom.uclaniPlaninara(rekreativac1);
        dom.uclaniPlaninara(rekreativac2);
        dom.uclaniPlaninara(rekreativac3);
        dom.uclaniPlaninara(alpinista1);
        dom.uclaniPlaninara(alpinista2);
        dom.uclaniPlaninara(alpinista3);
        System.out.println("Broj uspesno popetih: " + dom.brojUspesnih(planina));
        dom.izbaciPlaninara(9);
        dom.stampaj();
        System.out.println("Mesecni prihod od clanarina svih planinara: " + dom.sumaClanarina() + "din.");
    }
}

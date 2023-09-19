package d19_09_2023.zadatak2;

public class RekreativniPlaninar extends Planinar {
    private int tezinaOpreme;
    private String okrug;
    private double maxUsponBezOpreme;
    private Planina planina;

    public RekreativniPlaninar(int identifikacioniBroj, String imePrezime, int tezinaOpreme, String okrug, double maxUsponBezOpreme) {
        super(identifikacioniBroj, imePrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }
    @Override
    public boolean uspesanUspon (Planina planina) {
        this.maxUsponBezOpreme -= this.tezinaOpreme * 50;
        return this.maxUsponBezOpreme > planina.getVisina();
    }
    @Override
    public double cenaClanarine () {
        return 1000;
    }
    @Override
    public void stampaj () {
        System.out.println("Rekreativac, id: " + this.identifikacioniBroj);
        System.out.println("ime: " + this.imePrezime);
        System.out.println("Okrug: " + this.okrug);
        System.out.println();
    }

    public Planina getPlanina() {
        return planina;
    }

    public void setPlanina(Planina planina) {
        this.planina = planina;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public double getMaxUsponBezOpreme() {
        return maxUsponBezOpreme;
    }
}

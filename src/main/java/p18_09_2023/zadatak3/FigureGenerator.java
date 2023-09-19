package p18_09_2023.zadatak3;

import java.util.ArrayList;

public class FigureGenerator {
    public Figura generisiFiguru (String tip) {
        Figura figura = null;
        if (tip.equals("trougao")) {
            figura = new JednakostranicniTrougao(5);
        }
        if (tip.equals("pravougaonik")) {
            figura = new Pravougaonik(5, 10);
        }
        return figura;
    }

    public ArrayList<Figura> generisiTrouglove (int n) {
        ArrayList<Figura> figure = null;
        for (int i = 0; i < n; i++) {
            figure.add(this.generisiFiguru("trougao"));
        }
        return figure;
    }
    public ArrayList<Figura> generisiPravougaonike (int n) {
        ArrayList<Figura> figure = null;
        for (int i = 0; i < n; i++) {
            figure.add(this.generisiFiguru("pravougaonik"));
        }
        return figure;
    }
    public ArrayList<Figura> generisiNFigura (int n) {
        ArrayList<Figura> sveFigure = new ArrayList<>();
        Figura figura;
        for (int i = 0; i < n; i++) {
            figura = generisiFiguru("trougao");
            sveFigure.add(figura);
            figura = generisiFiguru("pravougaonik");
            sveFigure.add(figura);
        }
        return sveFigure;
    }

}

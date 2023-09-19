package d18_09_2023.zadatak1;

public class QualityOptimizerControl extends Control{
    private double brzinaInterneta;

    public QualityOptimizerControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoplayer) {
        double kvalitet = brzinaInterneta * 10.1;
        if (kvalitet < 144) {
            videoplayer.setKvalitet(144);
        } else if (kvalitet >= 144 && kvalitet < 240) {
            videoplayer.setKvalitet(240);
        } else if (kvalitet >= 240 && kvalitet <= 720) {
            videoplayer.setKvalitet(720);
        }
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
}

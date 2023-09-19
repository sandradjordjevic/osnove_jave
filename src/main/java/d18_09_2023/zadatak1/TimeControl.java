package d18_09_2023.zadatak1;

public class TimeControl extends Control{
    private boolean daLiPomeraTrenutnoVremeULevo;

    public TimeControl() {
    }

    @Override
    public void izvrsiAkciju (VideoPlayer videoplayer) {
        if (daLiPomeraTrenutnoVremeULevo) {
            videoplayer.setTrenutnoVreme(videoplayer.getTrenutnoVreme() + 15);
            if (videoplayer.getTrenutnoVreme() > videoplayer.getDuzina()) {
                videoplayer.setTrenutnoVreme(videoplayer.getDuzina());
            }
        } else {
            videoplayer.setTrenutnoVreme(videoplayer.getTrenutnoVreme() - 15);
            if (videoplayer.getTrenutnoVreme() < 0) {
                videoplayer.setTrenutnoVreme(0);
            }
        }
    }

    public boolean isDaLiPomeraTrenutnoVremeULevo() {
        return daLiPomeraTrenutnoVremeULevo;
    }

    public void setDaLiPomeraTrenutnoVremeULevo(boolean daLiPomeraTrenutnoVremeULevo) {
        this.daLiPomeraTrenutnoVremeULevo = daLiPomeraTrenutnoVremeULevo;
    }
}

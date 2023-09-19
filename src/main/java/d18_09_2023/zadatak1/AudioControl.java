package d18_09_2023.zadatak1;

public class AudioControl extends Control{
    private boolean daLiPojacavaZvuk;

    public AudioControl() {
    }
    @Override
    public void izvrsiAkciju (VideoPlayer videoplayer) {
        if(daLiPojacavaZvuk) {
            videoplayer.setJacina(videoplayer.getJacina() + 1);
            if (videoplayer.getJacina() > 100) {
                videoplayer.setJacina(100);
            }
        } else {
            videoplayer.setJacina(videoplayer.getJacina() - 1);
            if(videoplayer.getJacina() < 0) {
                videoplayer.setJacina(0);
            }
        }
    }

    public boolean isDaLiPojacavaZvuk() {
        return daLiPojacavaZvuk;
    }

    public void setDaLiPojacavaZvuk(boolean daLiPojacavaZvuk) {
        this.daLiPojacavaZvuk = daLiPojacavaZvuk;
    }
}

package p14_09_2023.zadatak4;

public class InstagramTag {
    private int xKoordinata;
    private int yKoordinata;
    private InstagramUser user;

    public InstagramTag(int xKoordinata, int yKoordinata, InstagramUser user) {
        this.xKoordinata = xKoordinata;
        this.yKoordinata = yKoordinata;
        this.user = user;
    }
    public int getxKoordinata() {
        return xKoordinata;
    }

    public int getyKoordinata() {
        return yKoordinata;
    }

    public InstagramUser getUser() {
        return user;
    }
}

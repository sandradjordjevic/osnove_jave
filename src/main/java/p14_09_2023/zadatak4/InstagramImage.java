package p14_09_2023.zadatak4;

import java.util.ArrayList;

public class InstagramImage {
    private int length;
    private int height;
    private String imageSrc;
    private ArrayList<InstagramTag> tags;

    public InstagramImage(int length, int height, String imageSrc) {
        this.length = length;
        this.height = height;
        this.imageSrc = imageSrc;
        this.tags = new ArrayList<>();
    }
    public void addTag (InstagramTag tag) {
        this.tags.add(tag);
    }
    public int getLength() {
        return length;
    }

    public ArrayList<InstagramTag> getTags() {
        return tags;
    }

    public int getHeight() {
        return height;
    }

    public String getImageSrc() {
        return imageSrc;
    }
}

package p14_09_2023.zadatak4;

import java.util.ArrayList;

public class InstagramPost {
    private String description;
    private ArrayList<InstagramImage> images;

    public InstagramPost(String description) {
        this.description = description;
        this.images = new ArrayList<>();
    }

    public void addImage (InstagramImage image) {
        this.images.add(image);
    }
    public String getDescription() {
        return description;
    }

    public ArrayList<InstagramImage> getImages() {
        return images;
    }
}

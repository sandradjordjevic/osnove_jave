package d11_09_2023;

public class FacebookPost {
    private String description;
    private User user;

    public FacebookPost (String description) {
        this.description = description;
    }
    public void printInfo () {
        this.user.print();
        System.out.println(this.description);
    }
    public void setDescription (String description) {
        this.description = description;
    }
    public String getDescription () {
        return this.description;
    }
    public void setUser (User user) {
        this.user = user;
    }
    public User getUser () {
        return this.user;
    }
}

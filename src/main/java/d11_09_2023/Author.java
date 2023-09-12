package d11_09_2023;

public class Author {
    private String firstName;
    private String lastName;

    public Author (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void print () {
        System.out.println(this.firstName + " " + this.lastName);
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName () {
        return this.firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public String getLastName () {
        return this.lastName;
    }
}

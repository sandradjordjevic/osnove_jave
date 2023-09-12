package d11_09_2023;

public class User {
    private String firstName;
    private String lastName;

    public User () {

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
    public void setLastNameName (String lastName) {
        this.lastName = lastName;
    }
    public String getLastNameName () {
        return this.lastName;
    }

}

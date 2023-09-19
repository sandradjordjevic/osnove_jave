package d18_09_2023.zadatak2;

public class EmailValidator extends Validator{
    private String email;


    public ValidationResult returnValidationResult () {
        ValidationResult result = new ValidationResult();
        if (this.email.contains("@") && (this.email.contains(".net") || this.email.contains(".com"))) {
            return result;
        } else {
            result.addError("Email is invalid!");
            return result;
        }
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

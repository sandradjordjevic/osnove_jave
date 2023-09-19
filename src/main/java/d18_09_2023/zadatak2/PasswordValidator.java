package d18_09_2023.zadatak2;

public class PasswordValidator extends Validator{
    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }
    public ValidationResult returnValidationResult () {
        ValidationResult result = new ValidationResult();
        if (!(this.password.contains("@")) && !(this.password.contains("#")) && !(this.password.contains("/")) && !(this.password.contains("*"))) {
            result.addError("Password must contain at least one special character @, # or *");
        }
        if (this.password.length() < 8) {
            result.addError("Password must be minimum 8 characters");
        }
        int counterUpperCase = 0;
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isUpperCase(this.password.charAt(i))) {
                counterUpperCase++;
            }
        }
        if (counterUpperCase == 0) {
            result.addError("Password must contain at least one uppercase letter");
        }
        int counterLowerCase = 0;
        for (int i = 0; i < this.password.length(); i++) {
            if (!(Character.isUpperCase(this.password.charAt(i)))) {
                counterLowerCase++;
            }
        }
        if (counterLowerCase < 1) {
            result.addError("Password must contain at least one lowercase letter");
        }
        int couterDigit = 0;
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isDigit(this.password.charAt(i))) {
                couterDigit++;
            }
        }
        if (couterDigit < 1) {
            result.addError("Password must contain at least one digit");
        }
        return result;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

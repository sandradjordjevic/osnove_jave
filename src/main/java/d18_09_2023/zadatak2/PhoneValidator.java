package d18_09_2023.zadatak2;

public class PhoneValidator extends  Validator{
    private String phoneNumber;

    public PhoneValidator(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public ValidationResult returnValidationResult () {
        ValidationResult result = new ValidationResult();
        if (!(this.phoneNumber.startsWith("+"))) {
            result.addError("Phone number must start with +");
        }
        int counterSpace = 0;
        for (int i = 0; i < this.phoneNumber.length(); i++) {
            if (this.phoneNumber.contains(" ")) {
                counterSpace++;
            }
        }
        if (counterSpace >= 1) {
            result.addError("Phone number cannot contain spaces");
        }
        int counterDigits = 0;
        for (int i = 1; i < this.phoneNumber.length(); i++) {
            if (Character.isDigit(this.phoneNumber.charAt(i)))
                counterDigits++;
        }
        if (!(counterDigits == this.phoneNumber.length() - 1)) {
            result.addError("Phone number can only contain numbers");
        }
        return result;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

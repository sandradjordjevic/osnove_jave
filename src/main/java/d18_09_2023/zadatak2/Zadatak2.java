package d18_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
    ValidationResult validationresult = new ValidationResult();


    EmailValidator email = new EmailValidator();
    email.setEmail("pera@.com");
    validationresult = email.returnValidationResult();
    validationresult.print();

    PasswordValidator passwordValidator = new PasswordValidator("BOOTCAMp");
    validationresult = passwordValidator.returnValidationResult();
    validationresult.print();

    PhoneValidator phonevalidator = new PhoneValidator("+55 a55 55");
    validationresult = phonevalidator.returnValidationResult();
    validationresult.print();
    }
}

package p14_09_2023.zadatak5;

public class Zadatak5 {
    public static void main(String[] args) {
        //5.Zadatak test case
        TestStep step1 = new TestStep("Open app", "", "", "the application is not running");
        TestStep step2 = new TestStep("Check if login link is visible", "visible", "visible", "login link is not visible");
        TestStep step3 = new TestStep("Click on login link", "", "", "can't be clicked");


        TestCase test1 = new TestCase("TC-1", "Checking the functionality of the search button");
        test1.addTestStep(step1);
        test1.addTestStep(step2);
        test1.addTestStep(step3);
        test1.printStatus();


    }
}

package p14_09_2023.zadatak5;

public class TestStep {
    private String description;
    private String actualResult;
    private String expectedResult;
    private String errorMessage;

    public TestStep(String description, String actualResult, String expectedResult, String errorMessage) {
        this.description = description;
        this.actualResult = actualResult;
        this.expectedResult = expectedResult;
        this.errorMessage = errorMessage;
    }
    public boolean validate () {
        return this.actualResult.equals(this.expectedResult);
    }
    public void stampaj () {
        System.out.println("| " + this.description + " |");
        if(this.validate()) {
            System.out.println("| Passed |");
        } else {
            System.out.println("| Failed |");
            System.out.println(this.errorMessage);
        }

    }

    public String getDescription() {
        return description;
    }

    public String getActualResult() {
        return actualResult;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

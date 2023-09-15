package p14_09_2023.zadatak5;

import java.util.ArrayList;

public class TestCase {
    private String id;
    private String name;
    ArrayList<TestStep> steps;

    public TestCase(String id, String name) {
        this.id = id;
        this.name = name;
        this.steps = new ArrayList<>();
    }
    public void addTestStep (TestStep step) {
        this.steps.add(step);
    }
    public int failedNumber () {
        int fail = 0;
        for (int i = 0; i < this.steps.size(); i++) {
            if (!(this.steps.get(i).validate())) {
                fail++;
            }
        }
        return fail;
    }
    public String testCaseStatus () {
        String status = "";
        if (this.failedNumber() == 0) {
            status = "PASS";
        }
        if (this.failedNumber() > 0) {
            status = "FAIL";
        }
        return status;
    }
    public void printStatus () {
        for (int i = 0; i < this.steps.size(); i++) {
            this.steps.get(i).stampaj();
        }
        System.out.println(this.steps.size() + "/" + this.failedNumber());
        System.out.println(this.testCaseStatus());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

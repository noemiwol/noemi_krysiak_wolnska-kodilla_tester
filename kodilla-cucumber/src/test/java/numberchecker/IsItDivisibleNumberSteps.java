package numberchecker;

import NumberChecker.NumberChecker;
import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivisibleNumberSteps implements En {
    private int number;
    private String answer;

    public IsItDivisibleNumberSteps() {
        Given("checking number is 2", () -> {
            this.number = 2;
        });

        Given("checking number is 5", () -> {
            this.number = 5;
        });

        Given("checking number is 9", () -> {
            this.number = 9;
        });

        Given("checking number is 15", () -> {
            this.number = 15;
        });

        Given("checking number is 21", () -> {
            this.number = 21;
        });

        Given("checking number is 30", () -> {
            this.number = 30;
        });

        Given("checking number is 40", () -> {
            this.number = 40;
        });

        Given("checking number is 45", () -> {

            this.number = 45;
        });

        Given("checking number is 90", () -> {
            this.number = 90;
        });

        When("checking whether the following number is divisible by concrete factors", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(this.number);
        });

        Then("I should receive {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class HomeworkSteps implements En {

    private CashSlots cashSlots = new CashSlots();
    private ATMsystem atMsystem = new ATMsystem(cashSlots);
    private Account account = new Account();
    private String answer;

    public HomeworkSteps() {

        Given("my account has been credited with $100", () -> {
            account.deposit(100);
        });

        When("I check my balance", () -> {
            this.answer = atMsystem.displayBalance(account);
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertEquals("Your account balance is: $100", answer);
        });

        Given("my wallet has been credited with $100", () -> {
            account.deposit(100);
        });

        When("I withdraw $200", () -> {
            this.answer = atMsystem.cashFlowProcess(account, 200);
            atMsystem.withdraw(account, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0,cashSlots.getContents());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            Assert.assertEquals("The amount requested exceeds the limit of available funds.", answer);
        });
    }
}

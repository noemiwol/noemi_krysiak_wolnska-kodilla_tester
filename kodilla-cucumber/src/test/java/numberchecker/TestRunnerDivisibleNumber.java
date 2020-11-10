package numberchecker;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/divisiblenumberchecker/is_it_divisible_number.feature"}
)
public class TestRunnerDivisibleNumber {
}
package FizzBuzz;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/FizzBuzz/is_it_Fizz_or_Buzz_or_FizzBuzz.feature"}
)
public class FizzBuzzTestRunner {
}

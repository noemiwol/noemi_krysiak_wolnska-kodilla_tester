
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void clickRandomResults(){
        Random number = new Random();
        int number1 = number.nextInt(results.size());

        results.get(number1).click();
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }
}

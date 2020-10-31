import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleRandom extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> googleRandom;

    public GoogleRandom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResultsGoogleRandom() {
        System.out.println("I see results by random");
        System.out.println(googleRandom.size());
    }
}

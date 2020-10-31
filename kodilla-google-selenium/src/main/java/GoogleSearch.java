
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {
    @FindBy(xpath = "//*[@id=/'tsf/']/div[2]/div[1]/div[1]/div/div[2]/input")
    static WebElement inputField;

    @FindBy(xpath = "//*[@id=/'tsf/']/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")
    static List<WebElement> searchButton;
    private static GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        googleResults.clickRandomResults();

    }

    public static GoogleResults loadResults(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
    public void acceptAlert() {
        driver.switchTo().frame(0);
        WebElement agreeButton = driver.findElement(By.id("introAgreeButton"));
        agreeButton.click();
        driver.switchTo().defaultContent();
    }
}
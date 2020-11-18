import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GoogleSearchTest {
    private WebDriver driver;
    private GoogleSearch googleSearch;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        googleSearch.acceptAlert();

    }

    @After
    public void tearDown() {
        driver.close();
    }

   /* @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }*/
}
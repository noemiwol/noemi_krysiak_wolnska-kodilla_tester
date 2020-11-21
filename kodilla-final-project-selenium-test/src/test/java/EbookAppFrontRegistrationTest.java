
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class EbookAppFrontRegistrationTest
{
    @Test
    public void registrationUserExists()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://ta-ebookrental-fe.herokuapp.com/register");

        WebElement buttonSingUp = driver.findElement(By.id("register-btn"));
        buttonSingUp.click();

        WebElement login= driver.findElement(By.id("login"));
        login.sendKeys("aaa");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("aaa");
        WebElement passwordRepeat = driver.findElement(By.id("password-repeat"));
        passwordRepeat.sendKeys("aaa");
        buttonSingUp.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/registrationUserExists.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public  void registrationOnePasswordNotCorrect(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://ta-ebookrental-fe.herokuapp.com/register");

        WebElement buttonSingUp = driver.findElement(By.id("register-btn"));
        buttonSingUp.click();

        WebElement login= driver.findElement(By.id("login"));
        login.sendKeys("bnm");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("aaa");
        WebElement passwordRepeat = driver.findElement(By.id("password-repeat"));
        passwordRepeat.sendKeys("aaca");
        buttonSingUp.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/OnePasswordNotCorrect.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void registrationEmptyFiledLogin(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://ta-ebookrental-fe.herokuapp.com/register");

        WebElement buttonSingUp = driver.findElement(By.id("register-btn"));
        buttonSingUp.click();

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("aaa");
        WebElement passwordRepeat = driver.findElement(By.id("password-repeat"));
        passwordRepeat.sendKeys("aaa");
        buttonSingUp.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/EmptyFiledLogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
}

    @Test
    public void registrationEmptyFiledRepeatPassword(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://ta-ebookrental-fe.herokuapp.com/register");

        WebElement buttonSingUp = driver.findElement(By.id("register-btn"));
        buttonSingUp.click();

        WebElement login= driver.findElement(By.id("login"));
        login.sendKeys("aaa");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("aaa");

        buttonSingUp.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/FiledRepeatPassword.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
}


}


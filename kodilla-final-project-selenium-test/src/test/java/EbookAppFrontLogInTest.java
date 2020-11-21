import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class EbookAppFrontLogInTest
{
    @Test
    public  void LogInCorrect(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver,5);
        driver.navigate().to("https://ta-ebookrental-fe.herokuapp.com/login");
        WebElement login= driver.findElement(By.id("login"));
        login.sendKeys("ddd");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("ddd");

        WebElement buttonLogIn = driver.findElement(By.id("login-btn"));
        buttonLogIn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/LogIn.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void invalidLoginWrongPassword(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver,5);
        driver.navigate().to("https://ta-ebookrental-fe.herokuapp.com/login");
        WebElement login= driver.findElement(By.id("login"));
        login.sendKeys("ddd");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("1234");

        WebElement buttonLogIn = driver.findElement(By.id("login-btn"));
        buttonLogIn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/WrongPassword.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();

}

    @Test
    public void invalidLoginWrongLogin(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver,5);
        driver.navigate().to("https://ta-ebookrental-fe.herokuapp.com/login");
        WebElement login= driver.findElement(By.id("login"));
        login.sendKeys("1234");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("ddd");

        WebElement buttonLogIn = driver.findElement(By.id("login-btn"));
        buttonLogIn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/WrongLogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();

}


}


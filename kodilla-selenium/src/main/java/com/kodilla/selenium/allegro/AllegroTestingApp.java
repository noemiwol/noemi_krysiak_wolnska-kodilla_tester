package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://allegro.pl/");
        new WebDriverWait(webDriver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='zamknij']"))).click();


        WebElement inputField = webDriver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(2) > header > div > div > div > div > form > input"));
        inputField.sendKeys("Mavic mini");
        webDriver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(2) > header > div > div > div > div > form > button")).click();

        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("body > div.main-wrapper > div:nth-child(4) > div > div > div > div > div > div._1yyhi._e219d_1fdR2 > div._3kk7b._otc6c._19orx._e219d_HGZ31 > div:nth-child(3) > div:nth-child(1) > div")));


        List<WebElement> searchResults = webDriver.findElements(By.cssSelector("body > div.main-wrapper > div:nth-child(4) > div > div > div > div > div > div._1yyhi._e219d_1fdR2 > div._3kk7b._otc6c._19orx._e219d_HGZ31 > div:nth-child(3) > div:nth-child(1) > div"));
        for (WebElement webElement : searchResults){
            System.out.println(webElement.getText());
        }




    }
}

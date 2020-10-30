package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://allegro.pl/");
        Alert alert = webDriver.switchTo().alert();
        alert.accept();

       /*
        webDriver.switchTo().frame(0);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[2]/div[5]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[2]/div[8]/div/div[2]/div/div[2]/button[2]")));
        webDriver.findElement(By.xpath("//html/body/div[2]/div[8]/div/div[2]/div/div[2]/button[2]")).click();*/

        WebElement inputField = webDriver.findElement(By.xpath("//html/body/div[2]/div[2]/header/div/div/div/div/form/input"));
        inputField.sendKeys("Mavic mini");
        /*inputField = driver.findElement(By.xpath("//*[@id=/'allegro.metrumHeader.search/']/div/form/input/div/div/span"));
        inputField.sendKeys("Elektronika")*/




    }
}

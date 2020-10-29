package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");
        webDriver.switchTo().frame(0);


        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yDmH0d")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("introAgreeButton")));
        webDriver.findElement(By.id("introAgreeButton")).click();


        WebElement inputField = (WebElement) webDriver.findElements(By.name("q"));
        inputField.sendKeys("kodilla");
        inputField.submit();

    }
}

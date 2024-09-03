package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumTestForOnlineShop {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhuri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:\\Users\\Madhuri\\IdeaProjects\\TestDemo\\src\\src\\main\\java\\org\\example\\OnlineShop.html");

        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));

        WebElement itemNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("itemName")));
        itemNameInput.sendKeys("Smartphone");

        Select itemCategoryDropdown = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("itemCategory"))));
        itemCategoryDropdown.selectByValue("electronics");

        WebElement itemDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("itemDescription")));
        itemDescription.sendKeys("A high-quality smartphone with the latest features.");

        WebElement sizeMedium = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sizeMedium")));
        sizeMedium.click();

        WebElement sizeLarge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sizeLarge")));
        sizeLarge.click();

        WebElement priceInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("price")));
        priceInput.sendKeys("$699");

        WebElement homeLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));
        homeLink.click();

        // driver.quit();
    }
}

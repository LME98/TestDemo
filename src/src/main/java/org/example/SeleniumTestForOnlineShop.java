package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestForOnlineShop {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhuri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:\\Users\\Madhuri\\IdeaProjects\\TestDemo\\src\\src\\main\\java\\org\\example\\OnlineShop.html");

        WebElement itemNameInput = driver.findElement(By.id("itemName"));
        itemNameInput.sendKeys("Smartphone");

        WebElement electronicsCategory = driver.findElement(By.id("category1"));
        electronicsCategory.click();

        WebElement itemDescription = driver.findElement(By.id("itemDescription"));
        itemDescription.sendKeys("A high-quality smartphone with the latest features.");

        WebElement sizeMedium = driver.findElement(By.id("sizeMedium"));
        sizeMedium.click();

        WebElement sizeLarge = driver.findElement(By.id("sizeLarge"));
        sizeLarge.click();

        WebElement priceInput = driver.findElement(By.id("price"));
        priceInput.sendKeys("$699");

//        WebElement addToCartButton = driver.findElement(By.xpath("//button[@type='submit']"));
//        addToCartButtonrtButton.click();

        WebElement homeLink = driver.findElement(By.linkText("Home"));
        homeLink.click();

//        driver.quit();
    }

}

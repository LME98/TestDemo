package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {

    public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        System.out.println(driver.findElement(By.id("login_field")));
        System.out.println(driver.findElement(By.name("password")));
        System.out.println(driver.findElement(By.className("header-logo")));
        System.out.println(driver.findElement(By.linkText("Forgot password?")));
        System.out.println(driver.findElement(By.partialLinkText("Create an")));
        System.out.println(driver.findElement(By.tagName("h1")));
        System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
        System.out.println(driver.findElement(By.cssSelector("input[name='commit']")));
        driver.close();
    }

}

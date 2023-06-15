package HomeWork18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class Hover {
    @Test
    public void hover(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(".dropdown")))
        .pause(Duration.ofSeconds(1))
        .moveToElement(driver.findElement(By.cssSelector(".secondary-dropdown a[data-toggle]")))
                .pause(Duration.ofSeconds(1))
                .moveToElement(driver.findElement(By.cssSelector(".dropdown-menu.secondary a")))
                .click()
                .pause(Duration.ofSeconds(2))
                .perform();


        WebElement serchResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/h1"));
        Assert.assertTrue(serchResult.getText().contains("Secondary Page"));



        driver.quit();




    }
}

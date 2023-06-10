package wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;
import java.util.stream.Collectors;

public class LoginPass {

    @Test
    public void loginPass(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        //driver.findElement(By.xpath(String.format("//label[text()='%s]/../input", "Password")));
        //driver.findElement(By.xpath(String.format("//label[text()='%s]/../input", "Username")));

        WebElement searchArea = driver.findElement(By.cssSelector("[name='username']"));
        searchArea.sendKeys("tomsmith");

        WebElement searchArea2 = driver.findElement(By.cssSelector("[name='password']"));
        searchArea2.sendKeys("SuperSecretPassword!"+ Keys.ENTER);

        WebElement serchResult = driver.findElement(By.cssSelector(".large-12.columns .flash"));
        Assert.assertTrue(serchResult.getText().contains("You logged into a secure area!"));



        driver.quit();





    }
}

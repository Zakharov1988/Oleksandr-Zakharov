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

public class LoginFail {
    @Test

    public void loginFail(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement searchArea = driver.findElement(By.cssSelector("[name='username']"));
        searchArea.sendKeys("tomsmith");

        WebElement searchArea2 = driver.findElement(By.cssSelector("[name='password']"));
        searchArea2.sendKeys("SuperSecretPassword"+ Keys.ENTER);


        WebElement serchResult = driver.findElement(By.cssSelector(".large-12.columns .error"));
        Assert.assertTrue(serchResult.getText().contains("Your username is invalid!"));







        driver.quit();

    }


}

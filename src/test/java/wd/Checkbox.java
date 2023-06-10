package wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Checkbox {
    @Test
    public void checkbox(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).click();


        WebElement Option1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]"));
        Option1.click();


        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).click();


        //WebElement Option1 = driver.findElement(By.cssSelector("[type='checkbox']"));
        //driver.findElement(By.cssSelector(".example input[type='checkbox']")).click();

        //List<String>tableTexts = driver.findElements(By.cssSelector("[type='checkbox']"))
                //.stream().map(WebElement::getText).collect(Collectors.toList());




        //driver.findElement(By.cssSelector("[type='checkbox']")).click();
        //List<String> tableTexts = driver.findElements(By.cssSelector())
        //driver.findElement(By.cssSelector("[type='checkbox']")).findElement(By.tagName("checked"));
        //driver.quit();
    }
}

package wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static org.bouncycastle.crypto.tls.CipherType.stream;


public class HomeWork17 {
    @Test
    public void homeWork17(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");



        driver.findElement(By.cssSelector(".large-2.columns .button")).click();
        driver.findElement(By.cssSelector(".large-12.columns .alert")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/div[1]/a[3]")).click();

        List<String>tableTexts = driver.findElements(By.cssSelector("table tr td:nth-of-type(4)"))
                .stream().map(WebElement::getText).collect(Collectors.toList());


        System.out.println(tableTexts);

        driver.quit();


    }

}

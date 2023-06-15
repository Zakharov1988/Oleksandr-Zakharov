package HomeWork18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserName {
    @Test
    public void userName (){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img")))
                .pause(Duration.ofSeconds(2));

        actions.moveToElement(driver.findElement(By.xpath("//*[@id='content']/div/div[2]/img")))
                .pause(Duration.ofSeconds(2));
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='content']/div/div[3]/img")))
                .pause(Duration.ofSeconds(2))
                .perform();

        driver.quit();

    }
}

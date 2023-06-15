package HomeWork18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class DragAndDrop {
    private WebDriver driver;
    @Test
    public void dragAndDrop() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        driver.findElement(By.xpath("//*[@id='draggable']/p")).click();
        Actions actions = new Actions(driver);

        WebElement element1 = driver.findElement(By.xpath("//*[@id='draggable']/p"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id='droppable']"));



        actions.click();
        actions.moveToElement(element1).clickAndHold(element1).moveToElement(element2).pause(Duration.ofSeconds(2))
                .release().perform();

        WebElement serchResult = driver.findElement(By.xpath("//*[@id='droppable']/p"));
        Assert.assertTrue(serchResult.getText().contains("Dropped!"));

        //actions.dragAndDrop(element1, element2).perform();
    }

        @AfterMethod(alwaysRun = true)
        public void CloseDriver() {
            if (driver != null) {
                driver.quit();
            }
        }
}

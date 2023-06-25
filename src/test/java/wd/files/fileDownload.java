package wd.files;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wd.BaseTest;

public class fileDownload extends BaseTest{
    @Test
    public void fileDownloadTest() {
        driver.get("https://the-internet.herokuapp.com/download");
        WebElement fileLink = driver.findElement(By.linkText("Test2.txt"));

        fileLink.click();

        System.out.println("done");
    }
}

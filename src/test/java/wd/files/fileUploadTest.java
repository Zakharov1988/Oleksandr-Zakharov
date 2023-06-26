package wd.files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.DriverHolder;
import wd.BaseTest;

import java.io.File;

public class fileUploadTest extends BaseTest {


    @Test
    public void uploadTest(){
            driver.get("https://the-internet.herokuapp.com/upload");

        File file = new File("target/downloads/Test2.txt");
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys(file.getAbsolutePath());
        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
        fileUploadButton.click();
    }
}

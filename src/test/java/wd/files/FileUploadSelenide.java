package wd.files;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FileUploadSelenide {
    @Test
    public void fileUplSeleni() {
        open("https://the-internet.herokuapp.com/upload");
        Configuration.timeout = 10;


        $("#file-upload").uploadFile(new File("target/downloads/Test2.txt"));
        $("#file-submit").click();
        $("#content > div > h3").shouldHave(text("File Uploaded!"));


    }
}

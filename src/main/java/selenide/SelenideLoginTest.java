package selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideLoginTest {
    @Test
public void selenideLoginTest() throws FileNotFoundException {
        Configuration.downloadsFolder = "target/downloads/";
        Configuration.savePageSource = false;
        Configuration.timeout = 10;

        open("https://the-internet.herokuapp.com/");
        $(By.linkText("Form Authentication")).click();
        SelenideElement username = $("#username");
        username.should(Condition.exist).clear();
        username.sendKeys("tomsmith");


        SelenideElement password = $("#password");
        password.clear();
        password.sendKeys("SuperSecretPassword!");

        $(".radius").click();

//        File file = username.download();
//        password.uploadFile(file);
}

}


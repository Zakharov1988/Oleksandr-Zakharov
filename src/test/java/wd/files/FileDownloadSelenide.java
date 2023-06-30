package wd.files;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FileDownloadSelenide {
    @Test
    public void fileDownSeleni() throws FileNotFoundException {

        Configuration.downloadsFolder = "target/downloads/";
        open("https://the-internet.herokuapp.com/download");
        $("#content > div > a:nth-child(20)").click();

        System.out.println("done");
    }
}

package wd.files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wd.BaseTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


@Test
public class editFileTest extends BaseTest {

    public static void main(String[] args) throws IOException {
//        File uploadFile = new File("target/downloads/Test2.txt");

        var path = Path.of("target/downloads/Test2.txt");
        List<String> lines = Files.readAllLines(path);
        //lines.forEach(System.out::println);

        try(FileWriter writer = new FileWriter("target/downloads/Test2.txt", false))
        {
            // запись всей строки
            String text = "Hello!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            lines.forEach(System.out::println);;
        }

    }
//    public void uploadTest(){
//        driver.get("https://the-internet.herokuapp.com/upload");
//
//        File file = new File("target/downloads/Test2.txt");
//        WebElement fileInput = driver.findElement(By.id("file-upload"));
//        fileInput.sendKeys(file.getAbsolutePath());
//        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
//        fileUploadButton.click();
//    }
}



package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver){
        super(driver);
        //this.driver = driver;
    }
    public LoginPage openAuthPage(){
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }
}

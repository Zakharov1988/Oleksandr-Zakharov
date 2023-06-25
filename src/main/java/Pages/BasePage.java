package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;

    protected WebDriverWait webDriverWait;
    protected Actions actions;
    protected JavascriptExecutor javascriptExecutor;

    public BasePage(WebDriver driver){
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        javascriptExecutor = (JavascriptExecutor)driver;

    }
    protected void setFieldValue(WebElement input, String value){
        input.clear();
        input.sendKeys(value);
    }

    protected void clickButton (WebElement button){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(button)).click();
    }

}
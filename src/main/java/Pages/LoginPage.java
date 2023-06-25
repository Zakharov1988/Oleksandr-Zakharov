package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BasePage {
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By LoginButtonLocator =  By.cssSelector(".radius");

    @FindBy(id = "username")
    private WebElement userNameInput;


    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = ".radius")
    private WebElement loginButton;

    @FindBy(css = ".flash.error")
    private WebElement errorPopup;

    @FindBy(css = "")
    List<WebElement>list;


    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        //this.driver = driver;
    }
    public LoginPage SetUsername(String username){
//        WebElement usernameE1 = driver.findElement(usernameLocator);
        setFieldValue(userNameInput, username);
//        usernameE1.clear();
//        usernameE1.sendKeys(username);
        return this;
    }

    public LoginPage SetPassword(String password){
//        WebElement passwordE1 = driver.findElement(passwordLocator);
        setFieldValue(passwordInput,password);
//        passwordE1.clear();
//        passwordE1.sendKeys(password);
        return this;
    }
    public SecurePage clickLoginButton(){
        clickButton(loginButton);
        //driver.findElement(LoginButtonLocator).click();
        return new SecurePage(driver);
    }

    public LoginPage loginWithInvalidCreds(){
        clickButton(loginButton);
        return this;
    }
    public String getErrorText() {
        return errorPopup.getText();
    }
    public SecurePage Login(String username, String password){
        SetUsername(username);
        SetPassword(password);
        return clickLoginButton();
    }
}

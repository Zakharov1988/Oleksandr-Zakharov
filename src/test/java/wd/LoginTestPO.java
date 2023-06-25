package wd;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.SecurePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestPO extends BaseTest {
    @Test
    public void loginTest(){
        driver.get("https://the-internet.herokuapp.com/");

        MainPage mainPage = new MainPage(driver);
        SecurePage securePage = mainPage.openAuthPage()
                .SetUsername("tomsmith")
                .SetPassword("SuperSecretPassword!")
                .clickLoginButton();

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.SetUsername("tomsmith");
//        loginPage.SetPassword("SuperSecretPassword!");
//        loginPage.clickLoginButton();
//
//        SecurePage securePage = new SecurePage(driver);
        Assert.assertEquals(securePage.getTitle(), "Secure Area", "Wrong page title is displayed");

        securePage.logout();

    }
}
package wd;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.SecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFaildPO extends BaseTest{

    @Test
    public void loginFaild(){

        LoginPage loginPage = openApp().openAuthPage()
        //MainPage mainPage = new MainPage(driver);
           // LoginPage loginPage = mainPage.openAuthPage()
                .SetUsername("tomsmith11111")
                .SetPassword("SuperSecretPassword!")
                .loginWithInvalidCreds();


            Assert.assertTrue(loginPage.getErrorText().contains("Your username is invalid!"));

    }
}

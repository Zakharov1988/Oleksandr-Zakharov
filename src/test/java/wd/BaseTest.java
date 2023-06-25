package wd;

import Pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    /*
    @BeforeSuite

    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeClass
    public void setUp() {
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass(alwaysRun = true)
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver(){
        driver.quit();

    }
    */

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp(){
        driver.quit();
    }

    public MainPage openApp(){
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage(driver);
    }
}

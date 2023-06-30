package selenide;

import Pages.selenidePages.DynamicallyElements;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DynamicallyElementsTest {
    @Test

    public void dynamicallyElementsTest(){
        Configuration.baseUrl= "https://the-internet.herokuapp.com/";
        Configuration.timeout = 10;
        Configuration.savePageSource = false;

        open("/dynamic_loading");
        DynamicallyElements Elements = new DynamicallyElements();
        Elements.ShowDinamicloading(true);
        Elements.ShowDinamicloading(false);
    }
}

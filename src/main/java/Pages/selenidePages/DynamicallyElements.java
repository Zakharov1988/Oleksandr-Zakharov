package Pages.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.C;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DynamicallyElements {
    private SelenideElement linc1 = $("#content > div > a:nth-child(5)");
    private SelenideElement linc2 = $("#content > div > a:nth-child(8)");

    private SelenideElement StartButton = $("#start > button");
    private SelenideElement Hidden1 = $("#loading > img");

    //private SelenideElement Hidden2 = $("#finish > h4");

    public void ShowDinamicloading (boolean hide) {
    linc1.click();
        Duration.ofSeconds(10);

    if (hide) {
        linc1.shouldNot(Condition.visible);

    }else {
        linc1.shouldBe(Condition.visible);
        Hidden1.shouldNot(Condition.visible);

    }





    }




}

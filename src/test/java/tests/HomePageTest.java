package tests;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.codeborne.selenide.Condition;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePageTest  extends BaseTest {
    @BeforeMethod
    public void before() {
        pageManager.homePage.open();
        acceptCookies();
    }

    @Test
    public void testHomePage() {
        assertThat(pageManager.homePage.getUrl()).isEqualTo("https://www.justlife.com/");
        Actions actions = Selenide.actions();
        actions.click(pageManager.homePage.location_input)
                .pause(200)
                .sendKeys(pageManager.homePage.location_input, "marina")
                .pause(700)
                .perform();
        pageManager.homePage.location_selector.click();


    }
}

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
                .pause(700)
                .sendKeys(pageManager.homePage.location_input, "marina")
                .pause(700)
                .perform();
        pageManager.homePage.location_selector.click();
        pageManager.homePage.home_cleaning.click();
        for (int i = 0; i <pageManager.homeCleaningPage.MaxDurationOfHours; i++) {
            pageManager.homeCleaningPage.getDurationSelector(i).click();
        }
        for (int i = 0; i <pageManager.homeCleaningPage.MaxNumberOfProfessionals ; i++) {
            pageManager.homeCleaningPage.numberOfProfessionals(i).click();
        }
        pageManager.homeCleaningPage.cleaning_materials_yes_selector.click();
        pageManager.homeCleaningPage.cleaning_materials_no_selector.click();
        pageManager.homeCleaningPage.next_button.click();
        pageManager.homeCleaningAddOnsPage.balconyCleaning.click();
        pageManager.homeCleaningAddOnsPage.ironingAndFolding.click();
        pageManager.homeCleaningAddOnsPage.partyCleaning.click();
        pageManager.homeCleaningAddOnsPage.addOnsRightArrow.click();
        pageManager.homeCleaningAddOnsPage.wardrobeCleaning.click();
        pageManager.homeCleaningAddOnsPage.kitchenAssitance.click();
//        pageManager.homeCleaningAddOnsPage.cupBoardCleaning.shouldBe(Condition.visible).click();
        pageManager.homeCleaningAddOnsPage.addOnsRightArrow.click();
//        pageManager.homeCleaningAddOnsPage.fridgeCleaning.click();
        pageManager.homeCleaningAddOnsPage.next_button.click();





    }
}

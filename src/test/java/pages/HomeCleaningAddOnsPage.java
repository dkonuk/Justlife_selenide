package pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class HomeCleaningAddOnsPage extends BasePage {
    public SelenideElement addOnsRightArrow = $(By.cssSelector("div[class='arrow-container arrow-icon en']"));
    public SelenideElement balconyCleaning = $(By.id("add-on-card-add-attribute-button-balcony_cleanings"));
    public SelenideElement ironingAndFolding = $(By.id("add-on-card-add-attribute-button-ironing_and_folding"));
    public SelenideElement partyCleaning = $(By.id("add-on-card-add-attribute-button-party_cleaning"));
    public SelenideElement wardrobeCleaning = $(By.id("add-on-card-add-attribute-button-wardrobe_cleaning"));
    public SelenideElement kitchenAssitance = $(By.id("add-on-card-add-attribute-button-kitchen_assistance"));
    public SelenideElement cupBoardCleaning = $(By.id("add-on-card-add-attribute-button-cupboard_cleaning"));
    public SelenideElement fridgeCleaning = $(By.id("add-on-card-add-attribute-button-fridge_cleaning"));
    public SelenideElement next_button = $(By.id("funnel-next-button"));



    public HomeCleaningAddOnsPage(String pageUrl) {super(pageUrl);}
}



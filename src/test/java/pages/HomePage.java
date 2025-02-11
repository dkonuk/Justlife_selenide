package pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public SelenideElement accept_cookies_button = $(By.id("confirm-cookies-button"));
    public SelenideElement location_input = $(By.id("location-input"));
    public SelenideElement location_selector = $(By.id("search-item-1"));
    public SelenideElement home_cleaning = $(By.id("service-home_cleaning"));
    public SelenideElement getDurationSelector(int duration) {
    return $(By.id("duration-" + duration + "-text"));
}

    public HomePage(String pageUrl) { super(pageUrl); }
}

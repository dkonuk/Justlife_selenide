package pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class HomeCleaningPage extends BasePage {
    public int MaxNumberOfProfessionals = 4;
    public int MaxDurationOfHours = 8;
    public SelenideElement getDurationSelector(int duration) {
        return $(By.id("duration-" + duration + "-text"));
    }
    public SelenideElement numberOfProfessionals(int number) {
        return $(By.id("number_of_cleaners-"+number+"-text"));
    }
    public SelenideElement cleaning_materials_no_selector = $(By.id("material-0-text"));
    public SelenideElement cleaning_materials_yes_selector = $(By.id("material-1-text"));
    public SelenideElement next_button = $(By.id("funnel-next-button"));
public HomeCleaningPage(String pageUrl) { super(pageUrl); }
}

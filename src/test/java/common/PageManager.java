package common;

import driver.DriverFactory;
import pages.*;

public class PageManager {
    public HomePage homePage;
    public HomeCleaningPage homeCleaningPage;
    public HomeCleaningAddOnsPage homeCleaningAddOnsPage;

    public PageManager() {
        DriverFactory.initDriver();
        homePage = PageFactory.buildHomePage();
        homeCleaningPage = PageFactory.buildHomeCleaningPage();
        homeCleaningAddOnsPage = PageFactory.buildHomeCleaningAddOnsPage();
    }


}

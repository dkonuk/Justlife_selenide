package common;

import driver.DriverFactory;
import pages.*;

public class PageManager {
    public HomePage homePage;

    public PageManager() {
        DriverFactory.initDriver();
        homePage = PageFactory.buildHomePage();
    }


}

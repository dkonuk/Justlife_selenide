package common;

import pages.*;

public class PageFactory {
    public static HomePage buildHomePage() {
        return new HomePage("");
    }
    public static HomeCleaningPage buildHomeCleaningPage() {
        return new HomeCleaningPage("");
    }

    public static HomeCleaningAddOnsPage buildHomeCleaningAddOnsPage() {
        return new HomeCleaningAddOnsPage("");
    }
}

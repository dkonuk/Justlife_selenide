package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import common.PageManager;
import driver.DriverFactory;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static driver.DriverFactory.maximize;

public class BaseTest {
    protected  PageManager pageManager = new PageManager();
    protected SoftAssert softAssert = new SoftAssert();
    @BeforeClass
    public void setup() {
        pageManager = new PageManager();
        softAssert = new SoftAssert();
    }

    @BeforeMethod
    public void openDriver() {
        Selenide.open();
        maximize();
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.close();
    }

    @AfterMethod
    public void clearCookies() {
        DriverFactory.clearCookies();
    }

    public void acceptCookies() {
        try {
            pageManager.homePage.accept_cookies_button.click();
        } catch (NoSuchElementException e) {
            System.out.println("Accept Cookies button is not present. Continuing test...");
        }

    }
    public int iterateOverAllChildren(String cssSelector, String childSelector) {
        SelenideElement parentElements = $(cssSelector);
        ElementsCollection childElements = parentElements.$$(childSelector);
        return childElements.size();
    }
}

package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.selenium.pageobject.SeleniumBasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.epam.healenium.constants.PagesType.TEST_ENV;

public class SemanticTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Button click with find element by id")
    public void testButtonClickWithId() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.ID, "change_id")
                .clickSubmitButton()
                .findTestElement(LocatorType.ID, "change_id");
    }

//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Find element by classname")
//    public void testFindElementByClassName() {
//        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.MARKUP));
//
//        mainPage.openPage()
//                .clickTestButton();
//        mainPage.confirmAlert();
//
//        mainPage
//                .generateMarkup()
//                .clickTestButton(); //should be healed
//        mainPage.confirmAlert();
//
//    }


    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by linktext")
    public void testFindElementByLinkText() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.PARTIAL_LINK_TEXT, "Change: LinkText, PartialLinkText")
                .clickSubmitButton()
                .findTestElement(LocatorType.PARTIAL_LINK_TEXT, "Change: LinkText, PartialLinkText");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Find element by name")
    public void testFindElementByName() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.NAME, "change_name")
                .clickSubmitButton()
                .findTestElement(LocatorType.NAME, "change_name");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by partialLinkText")
    public void testFindElementByPartialLinkText() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.PARTIAL_LINK_TEXT, "PartialLinkText")
                .clickSubmitButton()
                .findTestElement(LocatorType.PARTIAL_LINK_TEXT, "PartialLinkText");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by tagName")
    public void testFindElementByTagName() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.tagName("test_tag")).isDisplayed();
        page.clickSubmitButton();
        driver.findElement(By.tagName("test_tag")).isDisplayed();
    }
}

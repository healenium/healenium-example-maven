package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PagesType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
                .findTestElement(LocatorType.LINK_TEXT, "//*[@id='change_links']")
                .clickSubmitButton()
                .findTestElement(LocatorType.LINK_TEXT, "//*[@id='change_links']");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Find element by name")
    public void testFindElementByName() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.NAME, "//*[@id='newName']")
                .clickSubmitButton()
                .findTestElement(LocatorType.NAME, "//*[@id='newName']");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by partialLinkText")
    public void testFindElementByPartialLinkText() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.PARTIAL_LINK_TEXT, "//*[@id='change_links']")
                .clickSubmitButton()
                .findTestElement(LocatorType.PARTIAL_LINK_TEXT, "//*[@id='change_links']");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by tagName")
    public void testFindElementByTagName() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.TAG_NAME, "//*[@id='change_element']")
                .clickSubmitButton()
                .findTestElement(LocatorType.TAG_NAME, "//*[@id='change_element']");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by tagName")
    public void testPrice() {
        FrameworkPage page = pages.get(TEST_ENV);
        page.openPage();
        WebElement element = driver.findElement(By.className("total_price"));
        element.click();
        driver.findElement(By.id("close_popup"));
    }

}

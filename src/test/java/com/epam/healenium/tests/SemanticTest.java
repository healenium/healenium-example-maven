package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.epam.healenium.constants.PagesType.TEST_ENV;

public class SemanticTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Button click with find element by id")
    public void testButtonClickWithId() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.id("change_id"));
        page.clickSubmitButton();
        driver.findElement(By.id("change_id"));
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

        page.openPage();
        driver.findElement(By.cssSelector("a#change_links"));
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("a#change_links"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Find element by name")
    public void testFindElementByName() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.cssSelector("input#newName"));
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("input#newName"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by partialLinkText")
    public void testFindElementByPartialLinkText() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.cssSelector("a#change_links"));
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("a#change_links"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by tagName")
    public void testFindElementByTagName() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.cssSelector("input#change_element")).isDisplayed();
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("input#change_element")).isDisplayed();
    }
}

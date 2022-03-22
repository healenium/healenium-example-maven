package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.PagesType;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneralTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Button click with FindBy annotation")
    public void testButtonClickWithFindByAnnotationPage() {
        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.MARKUP_FIND_BY));

        mainPage.openPage().clickTestButton()
                .confirmAlert()
                .generateMarkup() //regenerate Markup
                .clickTestButton(); //find test button again
        mainPage.confirmAlert();  //confirm Alert again

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Select checkboxes with findElements annotation")
    public void testSelectCheckboxes() {
        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.TEST_ENV));

        mainPage.openPage()
                .findTestElements("//*[contains(@class,'test-form')]//*[@class='input1']")
                .clickFormButton()
                .findTestElements("//*[contains(@class,'test-form')]//*[@class='input1']");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Button click with disable healing")
    public void testButtonClickWithDisableHealing() {
        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.MARKUP_FIND_BY));

        boolean result = mainPage.openPage()
                .clickTestButton()
                .confirmAlert()
                .generateMarkup() //regenerate Markup
                .checkLocatorTestButtonDontHealing(); //find test button again
        assertTrue(result, "The locator was not healed");
    }
}

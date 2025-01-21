package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static com.epam.healenium.constants.PagesType.CALLBACK;
import static com.epam.healenium.constants.PagesType.TEST_ENV;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CssTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css attribute")
    public void testCssAttribute() {
        FrameworkPage callbackTestPage = pages.get(CALLBACK);

        boolean result = callbackTestPage
                .openPage()
                .clickAddSquareButton()
                .verifySquareElement();
        assertTrue(result, "Element with css enabled");

        for (int i = 0; i <= 2; i++) {
            result = callbackTestPage
                    .clickUpdateSquareButton()
                    .verifySquareElement(); //should be healed
            assertTrue(result, "Element with css was healed");
        }
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css id")
    public void testCssId() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='newValue']")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='newValue']");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css id with special character")
    public void testCssIdSpecialCharacter() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.CSS, "input#change\\:name")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "input#change\\:name");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Element")
    public void testCssElement() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_element']")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_element']");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Disabled")
    public void testCssDisabled() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.CSS, "input:disabled")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "input:disabled");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Enabled")
    public void testCssEnabled() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_enabled']")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_enabled']");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Checked")
    public void testCssChecked() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.CSS, "input:checked")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "input:checked");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Hover")
    public void testCssHover() {

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css ClassName")
    public void testCssClassName() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_className']")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_className']");
    }
}

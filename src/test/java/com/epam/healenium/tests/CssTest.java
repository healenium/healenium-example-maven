package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

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

        page.openPage();
        driver.findElement(By.cssSelector("#change_id"));
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("#change_id"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css id with special character")
    public void testCssIdSpecialCharacter() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.cssSelector("input#change\\:name"));
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("input#change\\:name"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Element")
    public void testCssElement() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.cssSelector("test_tag")).isDisplayed();
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("test_tag")).isDisplayed();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Disabled")
    public void testCssDisabled() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.cssSelector("input:disabled"));
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("input:disabled"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Enabled")
    public void testCssEnabled() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.cssSelector("textarea:enabled"));
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("textarea:enabled"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Checked")
    public void testCssChecked() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.cssSelector("input:checked"));
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("input:checked"));
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

        page.openPage();
        driver.findElement(By.cssSelector(".test_class"));
        page.clickSubmitButton();
        driver.findElement(By.cssSelector(".test_class"));
    }
}

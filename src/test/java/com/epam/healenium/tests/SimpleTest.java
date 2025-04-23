package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.epam.healenium.constants.PagesType.TEST_ENV;

public class SimpleTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css id")
    public void testCssId() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("#change_id"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css Enabled")
    public void testCssEnabled() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        page.clickSubmitButton();
        driver.findElement(By.cssSelector("textarea:enabled"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("XPath Not Contains")
    public void testXpathNotContains() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        page.clickSubmitButton();
        driver.findElement(By.xpath("//input[not(contains(@class, 'input1'))]"));
    }
}

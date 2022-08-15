package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PagesType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class WaitTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Conditional wait for simple locator: Explicit Wait")
    public void testConditionWait(){
        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.TEST_ENV));

        mainPage.openPage()
                .findTestElementWithWait(LocatorType.ID, "change_wait", 10)
                .clickSubmitButton()
                .findTestElementWithWait(LocatorType.ID, "change_wait", 10);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("")
    public void testFluentWait(){
        FrameworkPage page=pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElementFluentWait(LocatorType.ID, "change_wait", 10)
                .clickSubmitButton()
                .findTestElementFluentWait(LocatorType.ID, "change_wait", 10);
    }
}

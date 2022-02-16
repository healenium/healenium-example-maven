package com.epam.healenium.selenium.pageobject.testenv;

import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.selenium.pageobject.SeleniumBasePage;
import com.epam.healenium.selenium.search.Context;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEnvPage extends SeleniumBasePage {

    private By submitButton = By.id("Submit");

    public TestEnvPage(SelfHealingDriver driver) {
        super(driver);
    }

    public TestEnvPage openPage() {
        driver.get(PageUrl.TEST_ENV_URL.toString());
        return this;
    }

    public TestEnvPage findTestElement(LocatorType type, String selector) {
        boolean result = new Context(driver, type).executeStrategy(selector);
        assertTrue(result);
        return this;
    }

    public TestEnvPage clickSubmitButton() {
        driver.findElement(submitButton).click();
        return this;
    }
}

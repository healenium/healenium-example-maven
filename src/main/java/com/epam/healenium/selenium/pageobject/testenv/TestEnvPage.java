package com.epam.healenium.selenium.pageobject.testenv;

import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.selenium.pageobject.SeleniumBasePage;
import com.epam.healenium.selenium.search.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEnvPage extends SeleniumBasePage {

    private By submitButton = By.id("Submit");
    private By formButton = By.id("Submit_checkbox");

    public TestEnvPage(WebDriver driver) {
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

    public TestEnvPage findElementsUnderParent(String parentXpath, String childXpath) {
        List<WebElement> formElements = driver.findElement(By.xpath(parentXpath)).findElements(By.xpath("." + childXpath));
        formElements.forEach(f -> f.click());
        return this;
    }

    public TestEnvPage clickFormButton(){
        driver.findElement(formButton).click();
        return this;
    }
}

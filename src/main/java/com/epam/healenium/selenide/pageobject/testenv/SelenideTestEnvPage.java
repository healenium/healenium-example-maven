package com.epam.healenium.selenide.pageobject.testenv;

import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.selenide.pageobject.SelenideBasePage;
import com.epam.healenium.selenide.search.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelenideTestEnvPage extends SelenideBasePage {

    private By submitButton = By.id("Submit");
    private By formButton = By.id("Submit_checkbox");

    public SelenideTestEnvPage openPage() {
        open(PageUrl.TEST_ENV_URL.toString());
        return this;
    }

    public SelenideTestEnvPage findTestElement(LocatorType type, String selector) {
        boolean result = new Context(type).executeStrategy(selector);
        assertTrue(result);
        return this;
    }

    public SelenideTestEnvPage clickSubmitButton() {
        $(submitButton).click();
        return this;
    }

    public SelenideTestEnvPage findElementsUnderParent(String parentXpath, String childXpath) {
        List<WebElement> formElements = $(By.xpath(parentXpath)).findElements(By.xpath("." + childXpath));
        formElements.forEach(f -> f.click());
        return this;
    }

    public SelenideTestEnvPage clickFormButton(){
        $(formButton).click();
        return this;
    }
}

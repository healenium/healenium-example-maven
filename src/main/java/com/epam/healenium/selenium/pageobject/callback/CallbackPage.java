package com.epam.healenium.selenium.pageobject.callback;

import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.selenium.pageobject.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CallbackPage extends SeleniumBasePage {

    private By addSquareButton = By.xpath("//button[contains(@class, 'add')]");
    private By updateSquareButton = By.xpath("//button[contains(@class, 'update')]");
    private By removeSquareButton = By.xpath("//button[contains(@class, 'remove')]");

    private By testButtonCss = By.cssSelector("[c='red']");

    public CallbackPage(WebDriver driver) {
        super(driver);
    }

    public CallbackPage clickAddSquareButton() {
        driver.findElement(addSquareButton).click();
        return this;
    }

    public boolean verifySquareElement() {
        return driver.findElement(testButtonCss).isEnabled();
    }

    public CallbackPage clickUpdateSquareButton() {
        driver.findElement(updateSquareButton).click();
        return this;
    }

    public CallbackPage clickRemoveSquareButton() {
        driver.findElement(removeSquareButton).click();
        return this;
    }

    public CallbackPage openPage() {
        driver.get(String.valueOf(PageUrl.CALLBACK_URL));
        return this;
    }
}
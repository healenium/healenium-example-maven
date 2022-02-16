package com.epam.healenium.selenide.pageobject.callback;

import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.selenide.pageobject.SelenideBasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideCallbackPage extends SelenideBasePage {

    private By addSquareButton = By.xpath("//button[contains(@class, 'add')]");
    private By updateSquareButton = By.xpath("//button[contains(@class, 'update')]");

    private By testButtonCss = By.cssSelector("[c='red']");

    public SelenideCallbackPage openPage() {
        open(String.valueOf(PageUrl.CALLBACK_URL));
        return this;
    }

    public SelenideCallbackPage clickAddSquareButton() {
        $(addSquareButton).click();
        return this;
    }

    public boolean verifySquareElement() {
        return $(testButtonCss).isEnabled();
    }

    public SelenideCallbackPage clickUpdateSquareButton() {
        $(updateSquareButton).click();
        return this;
    }
}

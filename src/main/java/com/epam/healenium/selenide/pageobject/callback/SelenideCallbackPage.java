package com.epam.healenium.selenide.pageobject.callback;

import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.selenide.pageobject.SelenideBasePage;
import com.epam.reportportal.annotations.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideCallbackPage extends SelenideBasePage {

    private By addSquareButton = By.xpath("//button[contains(@class, 'add')]");
    private By updateSquareButton = By.xpath("//button[contains(@class, 'update')]");

    private By testButtonCss = By.cssSelector("[c='red']");

    @Step("Open page")
    public SelenideCallbackPage openPage() {
        open(String.valueOf(PageUrl.CALLBACK_URL));
        return this;
    }

    @Step("Click add square button")
    public SelenideCallbackPage clickAddSquareButton() {
        $(addSquareButton).click();
        return this;
    }

    @Step("Verify square element")
    public boolean verifySquareElement() {
        return $(testButtonCss).isEnabled();
    }

    @Step("Click update square button")
    public SelenideCallbackPage clickUpdateSquareButton() {
        $(updateSquareButton).click();
        return this;
    }
}

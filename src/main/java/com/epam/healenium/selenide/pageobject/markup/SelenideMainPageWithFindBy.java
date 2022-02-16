package com.epam.healenium.selenide.pageobject.markup;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.epam.healenium.annotation.DisableHealing;
import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.selenide.pageobject.SelenideBasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;

public class SelenideMainPageWithFindBy extends SelenideBasePage {
    @FindBy(xpath = "//button[contains(@class,'default-btn')]")
    public SelenideElement testButton;

    @FindBy(id = "markup-generation-button")
    public SelenideElement generateMarkupBtnId;

    public SelenideMainPageWithFindBy openPage(){
        open(PageUrl.MARKUP_URL.toString());
        return this;
    }

    public SelenideMainPageWithFindBy generateMarkup() {
        generateMarkupBtnId.shouldBe(Condition.visible).click();
        return this;
    }

    public SelenideMainPageWithFindBy clickTestButton() {
        testButton.shouldBe(Condition.visible).click();
        return this;
    }

    @DisableHealing
    public boolean checkLocatorTestButtonDontHealing() {
        try {
            testButton.shouldBe(Condition.visible).click();
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

}

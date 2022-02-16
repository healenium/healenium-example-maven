package com.epam.healenium.selenide.search.locators;

import com.epam.healenium.selenide.search.SelenideStrategy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenidePartialLinkStrategy implements SelenideStrategy {

    public SelenidePartialLinkStrategy() {
    }

    @Override
    public boolean doAction(String selector) {
        return $(By.partialLinkText(selector)).isDisplayed();
    }
}

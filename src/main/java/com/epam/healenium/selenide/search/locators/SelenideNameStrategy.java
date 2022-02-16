package com.epam.healenium.selenide.search.locators;

import com.epam.healenium.selenide.search.SelenideStrategy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideNameStrategy implements SelenideStrategy {
    public SelenideNameStrategy() {
    }

    @Override
    public boolean doAction(String selector) {
        return $(By.name(selector)).isDisplayed();
    }
}

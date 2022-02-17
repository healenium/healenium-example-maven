package com.epam.healenium.selenide.search.locators;

import com.epam.healenium.selenide.search.SelenideStrategy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideIdStrategy implements SelenideStrategy {
    public SelenideIdStrategy() {
    }

    @Override
    public boolean doAction(String selector) {
        return $(By.id(selector)).isDisplayed();
    }
}

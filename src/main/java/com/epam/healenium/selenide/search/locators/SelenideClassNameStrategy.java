package com.epam.healenium.selenide.search.locators;

import com.epam.healenium.selenide.search.SelenideStrategy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideClassNameStrategy implements SelenideStrategy {

    public SelenideClassNameStrategy() {
    }

    @Override
    public boolean doAction(String selector) {
        return $(By.className(selector)).isDisplayed();
    }
}

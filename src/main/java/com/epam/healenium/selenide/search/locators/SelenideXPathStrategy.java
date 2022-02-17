package com.epam.healenium.selenide.search.locators;

import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.selenide.search.SelenideStrategy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideXPathStrategy implements SelenideStrategy {

    public SelenideXPathStrategy() {
    }

    @Override
    public boolean doAction(String selector) {
        return $(By.xpath(selector)).isDisplayed();
    }
}

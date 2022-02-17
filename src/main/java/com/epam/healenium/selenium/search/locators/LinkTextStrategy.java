package com.epam.healenium.selenium.search.locators;

import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.selenium.search.Strategy;
import org.openqa.selenium.By;

public class LinkTextStrategy implements Strategy {
    private SelfHealingDriver driver;

    public LinkTextStrategy(SelfHealingDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doAction(String selector) {
        return driver.findElement(By.linkText(selector)).isDisplayed();
    }
}

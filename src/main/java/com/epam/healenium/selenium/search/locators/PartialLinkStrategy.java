package com.epam.healenium.selenium.search.locators;

import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.selenium.search.Strategy;
import org.openqa.selenium.By;

public class PartialLinkStrategy implements Strategy {
    private SelfHealingDriver driver;

    public PartialLinkStrategy(SelfHealingDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doAction(String selector) {
        return driver.findElement(By.partialLinkText(selector)).isDisplayed();
    }
}

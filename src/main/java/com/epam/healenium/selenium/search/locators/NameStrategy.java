package com.epam.healenium.selenium.search.locators;

import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.selenium.search.Strategy;
import org.openqa.selenium.By;

public class NameStrategy implements Strategy {
    private SelfHealingDriver driver;

    public NameStrategy(SelfHealingDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doAction(String selector) {
        return driver.findElement(By.name(selector)).isDisplayed();
    }
}

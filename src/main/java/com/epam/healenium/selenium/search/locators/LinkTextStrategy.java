package com.epam.healenium.selenium.search.locators;

import com.epam.healenium.selenium.search.Strategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkTextStrategy implements Strategy {
    private WebDriver driver;

    public LinkTextStrategy(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doAction(String selector) {
        return driver.findElement(By.linkText(selector)).isDisplayed();
    }
}

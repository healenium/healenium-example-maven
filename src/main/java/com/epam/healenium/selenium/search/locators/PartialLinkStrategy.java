package com.epam.healenium.selenium.search.locators;

import com.epam.healenium.selenium.search.Strategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PartialLinkStrategy implements Strategy {
    private WebDriver driver;

    public PartialLinkStrategy(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doAction(String selector) {
        return driver.findElement(By.xpath("//*[@id='change_links']")).isDisplayed();
    }
}

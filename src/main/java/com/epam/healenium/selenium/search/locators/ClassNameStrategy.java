package com.epam.healenium.selenium.search.locators;

import com.epam.healenium.selenium.search.Strategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassNameStrategy implements Strategy {
    private WebDriver driver;

    public ClassNameStrategy(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doAction(String selector) {
        return driver.findElement(By.className(selector)).isDisplayed();
    }

    @Override
    public boolean doWaitAction(String selector, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        return wait.until(ExpectedConditions.elementToBeClickable(
                        driver.findElement(By.className(selector))))
                .isDisplayed();
    }
}

package com.epam.healenium.selenium.search.locators;

import com.epam.healenium.selenium.search.Strategy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CssStrategy implements Strategy {
    private WebDriver driver;

    public CssStrategy(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doAction(String selector) {
        return driver.findElement(By.cssSelector(selector)).isDisplayed();
    }

    @Override
    public boolean doWaitAction(String selector, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.elementToBeClickable(
                        driver.findElement(By.cssSelector(selector))))
                .isDisplayed();
    }

    @Override
    public boolean doFluentAction(String selector, int seconds){
        Wait<WebDriver> fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        return fluentWait.until(ExpectedConditions.elementToBeClickable(
                        driver.findElement(By.cssSelector(selector))))
                .isDisplayed();
    }
}

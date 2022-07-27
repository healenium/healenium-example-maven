package com.epam.healenium.selenium.pageobject;

import com.epam.healenium.FrameworkPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBasePage extends FrameworkPage {
    protected String mainPageUrl = "https://sha-test-app.herokuapp.com/";
    protected WebDriver driver;

    public SeleniumBasePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void sleepForSecondsToSeeTheAlertWhileTestIsRunning(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public SeleniumBasePage confirmAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }
}
package com.epam.healenium.selenium.pageobject;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBasePage implements FrameworkPage {
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

//    @Attachment(value = "Screenshot", type = "image/png")
//    protected void screenshot() {
////        if (driver instanceof TakesScreenshot) {
//            SelfHealingDriver healingDriver=SelfHealingDriver.create(driver);
//            WebDriver dr=healingDriver.getDelegate();
//            byte[] screenshot = ((TakesScreenshot) dr).getScreenshotAs(OutputType.BYTES);
//            LoggingUtils.log(screenshot, "Test elements");
////        }
//    }

    public String getAlertText() {
        sleepForSecondsToSeeTheAlertWhileTestIsRunning(1);
        String foundAlertText = "";
        WebDriverWait wait = new WebDriverWait(driver, 0 /*timeout in seconds*/);
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            foundAlertText = driver.switchTo().alert().getText();
        } catch (TimeoutException eTO) {
            foundAlertText = "no alert text";
        }
        return foundAlertText;
    }

    @Override
    public FrameworkPage openPage() {
        return null;
    }

    @Override
    public FrameworkPage findTestElement(LocatorType css, String s) {
        return null;
    }

    @Override
    public FrameworkPage clickSubmitButton() {
        return null;
    }

    @Override
    public FrameworkPage clickAddSquareButton() {
        return null;
    }

    @Override
    public FrameworkPage clickUpdateSquareButton() {
        return null;
    }

    @Override
    public boolean verifySquareElement() {
        return false;
    }

    @Override
    public FrameworkPage clickTestButton() {
        return null;
    }

    public SeleniumBasePage confirmAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }

    @Override
    public FrameworkPage generateMarkup() {
        return null;
    }

    @Override
    public boolean displayedText() {
        return false;
    }

    @Override
    public boolean checkLocatorTestButtonDontHealing() {
        return false;
    }

    @Override
    public FrameworkPage selectFirstCheckbox() {
        return null;
    }

    @Override
    public boolean verifyFirstAccountCheckbox() {
        return false;
    }

    @Override
    public FrameworkPage selectFirstAccountCheckbox() {
        return null;
    }

    @Override
    public boolean groupInputEnabled() {
        return false;
    }

    @Override
    public void verifyInputText() {

    }

    @Override
    public void fillInputsGroup() {

    }

    @Override
    public FrameworkPage clickTestButtonWaitor(int i) {
        return null;
    }

    @Override
    public FrameworkPage findElementsUnderParent(String parentXpath, String childXpath) {
        return null;
    }

    @Override
    public FrameworkPage clickFormButton() {
        return null;
    }

    @Override
    public FrameworkPage findTestElements(String s) {
        return null;
    }
}
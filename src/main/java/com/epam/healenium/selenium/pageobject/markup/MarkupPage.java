package com.epam.healenium.selenium.pageobject.markup;

import com.epam.healenium.annotation.DisableHealing;
import com.epam.healenium.selenium.pageobject.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MarkupPage extends SeleniumBasePage {

    private By generateMarkupBtnId = By.id("markup-generation-button");
    private By testButton = By.className("default-btn");
    private By testGeneratedButton = By.id("random-id");

    private By checkboxAccount = By.xpath("//*[@class='checkbox checkbox_size_m checkbox_theme_alfa-on-white']");
    private By textFirstSelect = By.xpath("(//*[text()='Select Account'])[1]");

    private By firstCheckboxChecked = By.xpath("//*[text()='Current account']//parent::label[contains(@class,'checked')]");
    private By checkboxChecked = By.xpath("//label[contains(@class,'checkbox_checked')]");
    private By checkboxUnchecked = By.xpath("//label[not(contains(@class,'checkbox_checked'))]");

    private By parentInput = By.xpath("//*[contains(@class,'input-group') and @role='group']");//span[@class='input__box']");
    private By childInput = By.xpath(".//*[@value='']");

    public MarkupPage(WebDriver driver) {
        super(driver);
    }

    public MarkupPage openPage() {
        driver.get(mainPageUrl);
        return this;
    }

    public MarkupPage generateMarkup() {
        driver.findElement(generateMarkupBtnId).click();
        return this;
    }

    public MarkupPage clickTestButton() {
        driver.findElement(testButton).click();
        return this;
    }

    public MarkupPage clickTestGeneratedButton() {
        driver.findElement(testGeneratedButton).click();
        return this;
    }

    @DisableHealing
    public boolean displayedText() {
        try {
            return driver.findElement(textFirstSelect).isEnabled();
        } catch (NoSuchElementException e1) {
            return false;
        }
    }

    public MarkupPage selectFirstCheckbox() {
        driver.findElements(checkboxAccount).get(0).click();
        return this;
    }

    public boolean verifyFirstCheckbox() {
        return driver.findElements(checkboxAccount).get(0).isEnabled();
    }

    @DisableHealing
    public int verifyAllCheckboxesChecked() {
        List<WebElement> checkboxes = driver.findElements(checkboxChecked);
        checkboxes.forEach(c -> assertTrue(c.isEnabled()));
        return checkboxes.size();
    }

    @DisableHealing
    public int verifyAllCheckboxesUnchecked() {
        List<WebElement> checkboxes = driver.findElements(checkboxUnchecked);
        checkboxes.forEach(c -> assertTrue(c.isEnabled()));
        return checkboxes.size();
    }

    public int selectAllCheckboxes() {
        List<WebElement> checkboxes = driver.findElements(checkboxAccount);
        if (checkboxes.size() == 0)
            throw new NoSuchElementException("No checkboxes found");
        checkboxes.forEach(c -> c.click());
        return checkboxes.size();
    }

    public boolean verifyFirstAccountCheckbox() {
        return driver.findElement(firstCheckboxChecked).isEnabled();
    }

    public MarkupPage selectFirstAccountCheckbox() {
        driver.findElement(firstCheckboxChecked).click();
        return this;
    }

    @DisableHealing
    public boolean testButtonEnable() {
        try {
            return driver.findElement(testGeneratedButton).isEnabled();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @DisableHealing
    public boolean groupInputEnabled() {
        try {
            return driver.findElement(parentInput).isEnabled()
                    && driver.findElement(By.xpath("//*[@placeholder='Just some text']"))
                    .isEnabled();
        } catch (NoSuchElementException e1) {
            return false;
        }
    }

    @DisableHealing
    public void fillInputsGroup() {
        WebElement parent = driver.findElement(parentInput);
        List<WebElement> child = parent.findElements(childInput);
        child.forEach(c -> c.sendKeys("Value"));
    }

    public void verifyInputText() {
        WebElement parent = driver.findElement(parentInput);
        List<WebElement> child = parent.findElements(childInput);
        if (child.size() == 0)
            throw new NoSuchElementException("No inputs found");
        child.forEach(c -> assertTrue(c.isEnabled()));
    }

    public MarkupPage clickTestButtonWaitor(int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.elementToBeClickable(testButton)).click();

        return this;
    }
}

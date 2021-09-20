package seleniumrp.pages;


import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.annotation.DisableHealing;
import com.epam.reportportal.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends BasePage {
    By generateMarkupBtnId = By.id("markup-generation-button");
    By testButton = By.className("default-btn");
    By testGeneratedButton = By.id("random-id");

    By checkboxAccount = By.xpath("//*[@class='checkbox checkbox_size_m checkbox_theme_alfa-on-white']");
    By textFirstSelect = By.xpath("(//*[text()='Select Account'])[1]");

    By firstCheckboxChecked = By.xpath("//*[text()='Current account']//parent::label[contains(@class,'checked')]");

    public MainPage(SelfHealingDriver driver) {
        super(driver);
    }

    @Step("Open Main page")
    public MainPage open() {
        driver.get(mainPageUrl);
        return this;
    }

    @Step("Generate Markup")
    public MainPage generateMarkup() {
        driver.findElement(generateMarkupBtnId).click();
        return this;
    }

    @Step("Click test button")
    public MainPage clickTestButton() {
        driver.findElement(testButton).click();
        return this;
    }

    @Step("Click test button after generating markup")
    public void clickTestGeneratedButton() {
        driver.findElement(testGeneratedButton).click();
    }

    @DisableHealing
    @Step("Check that checkboxes available")
    public boolean displayedText() {
        try {
            return driver.findElement(textFirstSelect).isEnabled();
        } catch (NoSuchElementException e1) {
            return false;
        }
    }

    @Step("Select first available account from checkboxes")
    public void selectFirstCheckbox() {
        driver.findElements(checkboxAccount).get(0).click();
    }

    @Step("Verify first account checkbox selected")
    public boolean verifyFirstCheckbox() {
        return driver.findElements(checkboxAccount).get(0).isEnabled();
    }

    @Step("Select all available accounts from checkboxes")
    public void selectAllCheckboxes() {
        List<WebElement> checkboxes = driver.findElements(checkboxAccount);
        checkboxes.forEach(c -> c.click());
    }

    @Step("Verify first account checkbox checked")
    public boolean verifyFirstAccountCheckbox() {
        return driver.findElement(firstCheckboxChecked).isEnabled();
    }

    @Step("Click first account checkbox")
    public void selectFirstAccountCheckbox() {
        driver.findElement(firstCheckboxChecked).click();
    }
}

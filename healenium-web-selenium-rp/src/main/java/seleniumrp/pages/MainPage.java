package seleniumrp.pages;


import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.annotation.DisableHealing;
import com.epam.reportportal.annotations.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage extends BasePage {
    By generateMarkupBtnId = By.id("markup-generation-button");
    By testButton = By.className("default-btn");
    By testGeneratedButton = By.id("random-id");

    By checkboxAccount = By.xpath("//*[@class='checkbox checkbox_size_m checkbox_theme_alfa-on-white']");
    By textFirstSelect = By.xpath("(//*[text()='Select Account'])[1]");

    By firstCheckboxChecked = By.xpath("//*[text()='Current account']//parent::label[contains(@class,'checked')]");
    By checkboxChecked = By.xpath("//label[contains(@class,'checkbox_checked')]");
    By checkboxUnchecked = By.xpath("//label[not(contains(@class,'checkbox_checked'))]");

    By parentInput = By.xpath("//*[contains(@class,'input-group') and @role='group']//span[@class='input__box']");
    By childInput = By.xpath(".//*[@value='']");

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

    @DisableHealing
    @Step("Verify all account checkbox selected")
    public int verifyAllCheckboxesChecked() {
        List<WebElement> checkboxes=driver.findElements(checkboxChecked);
        checkboxes.forEach(c->assertTrue(c.isEnabled()));
        return checkboxes.size();
    }

    @DisableHealing
    @Step("Verify all account checkbox unchecked")
    public int verifyAllCheckboxesUnchecked() {
        List<WebElement> checkboxes=driver.findElements(checkboxUnchecked);
        checkboxes.forEach(c->assertTrue(c.isEnabled()));
        return checkboxes.size();
    }

    @Step("Select all available accounts from checkboxes")
    public int selectAllCheckboxes() {
        List<WebElement> checkboxes = driver.findElements(checkboxAccount);
        if (checkboxes.size() == 0)
            throw new NoSuchElementException("No checkboxes found");
        checkboxes.forEach(c -> c.click());
        return checkboxes.size();
    }

    @Step("Verify first account checkbox checked")
    public boolean verifyFirstAccountCheckbox() {
        return driver.findElement(firstCheckboxChecked).isEnabled();
    }

    @Step("Click first account checkbox")
    public MainPage selectFirstAccountCheckbox() {
        driver.findElement(firstCheckboxChecked).click();
        return this;
    }

    @DisableHealing
    @Step("Check that test button with id locator is enabled")
    public boolean testButtonEnable()
    {
        try
        {
            return driver.findElement(testGeneratedButton).isEnabled();
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

    @DisableHealing
    @Step("Waiting till group input enabled")
    public boolean groupInputEnabled(){
        try {
            return driver.findElement(parentInput).isEnabled()
                    && driver.findElement(By.xpath("//*[@placeholder='Button']"))
                    .isEnabled();
        } catch (NoSuchElementException e1) {
            return false;
        }
    }

    @DisableHealing
    @Step("Fill all inputs in group")
    public void fillInputsGroup() {
        WebElement parent = driver.findElement(parentInput);
        List<WebElement> child = parent.findElements(childInput);
        child.forEach(c -> c.sendKeys("Value"));
    }

    @Step("Verify input text")
    public void verifyInputText() {
        WebElement parent = driver.findElement(parentInput);
        List<WebElement> child = parent.findElements(childInput);
        if (child.size() == 0)
            throw new NoSuchElementException("No inputs found");
        child.forEach(c -> c.isEnabled());
    }

    @Step("Click test button with conditional waits")
    public MainPage clickTestButtonWaitor() {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(testButton)).click();

        return this;
    }

    @Step("Click on test buton via js script")
    public MainPage clickJsButton() {
        String query = "return document.getElementsByClassName('default-btn')[0]";
        ((WebElement)((JavascriptExecutor) driver).executeScript(query)).click();
        return this;
    }
}

package pages;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AjaxLoadPage extends BasePage {

    @FindBy(xpath = "//div[@class='spinner-demo spinner-demo-absolute spinner-demo-add']")
    private WebElement loadingSpinner;

    @FindBy(id = "ajax-button")
    private WebElement sendRequestButton;

    private By contentLoaded = By.cssSelector("div#ajax-container");

    public AjaxLoadPage(SelfHealingDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public AjaxLoadPage open() {
        driver.get(ajaxLoadPageUrl);
        return this;
    }

    public AjaxLoadPage click() {
        sendRequestButton.click();
        return this;
    }

    public boolean isLoadingSpinnerDisplayed() {
        try {
            loadingSpinner.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isLoadingContentDisplayed() {
        try {
            driver.findElement(contentLoaded).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public AjaxLoadPage waitForLoadingSpinnerToDisappear() {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.invisibilityOf(loadingSpinner));
        return this;
    }

}

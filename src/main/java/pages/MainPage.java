package pages;


import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    By generateMarkupBtnId = By.id("markup-generation-button");
    By testButton = By.xpath("//button[contains(@class,'default-btn')]");

    public MainPage(SelfHealingDriver driver) {
        super(driver);
    }

    public MainPage open() {
        driver.get(mainPageUrl);
        return this;
    }

    public MainPage generateMarkup() {
        driver.findElement(generateMarkupBtnId).click();
        return this;
    }

    public MainPage clickTestButton() {
        driver.findElement(testButton).click();
        return this;
    }
}

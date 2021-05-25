package selenium.pages;


import com.epam.healenium.SelfHealingDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    By generateMarkupBtnId = By.id("markup-generation-button");
    By testButton = By.xpath("//button[contains(@class,'default-btn')]");

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

  @Step("Get test button text")
  public String getTestButtonText() {
        return driver.findElement(testButton).getText();
    }
}

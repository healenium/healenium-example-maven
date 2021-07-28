package selenium.pages;


import com.epam.healenium.SelfHealingDriver;
import io.qameta.allure.Step;
import jdk.jfr.internal.tool.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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

    @Step("Click test button casted with JS Executor")
    public MainPage clickJsTestButton() {
        WebElement el=this.getTestButton();
        System.out.println(el.getText());
        el.click();
        return this;
    }
    private WebElement getTestButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        return ((WebElement) js.executeScript("return document.getElementsByClassName('default-btn')[0]"));
        return (WebElement) js.executeScript("return arguments[0].shadowRoot", driver.findElement(testButton));
    }

}

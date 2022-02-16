package cucumber.step_definitions;

import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.selenium.pageobject.callback.CallbackPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CallbackPageBinding {

    @Getter
    @Setter
    private SelfHealingDriver driver;

    private By addSquareButton = By.xpath("//button[contains(@class, 'add')]");
    private By updateSquareButton = By.xpath("//button[contains(@class, 'update')]");
    private By removeSquareButton = By.xpath("//button[contains(@class, 'remove')]");

    private By testButtonCss = By.cssSelector("[c='red']");

    @Given("click add square button")
    public void clickAddButton(){
        new CallbackPage(driver).clickAddSquareButton();
        driver.findElement(addSquareButton).click();
    }

    @Given("verify that appeared CSS attribute (.*)")
    @Then("verify that healing appears for changing CSS attribute (.*)")
    public void verifySquareElement(String cssAtt) {
        boolean result = driver.findElement(By.cssSelector(cssAtt)).isEnabled();
        assertTrue(result, "Element with css enabled");
    }

    @When("click update square button")
    public void clickUpdateSquareButton() {
        driver.findElement(updateSquareButton).click();
    }

    @Given("click remove square button")
    public void clickRemoveSquareButton() {
        driver.findElement(removeSquareButton).click();
    }
}

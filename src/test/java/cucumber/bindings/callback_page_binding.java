package cucumber.bindings;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class callback_page_binding {

    @Getter
    @Setter
    private WebDriver driver;

    private By addSquareButton = By.xpath("//button[contains(@class, 'add')]");
    private By updateSquareButton = By.xpath("//button[contains(@class, 'update')]");
    private By removeSquareButton = By.xpath("//button[contains(@class, 'remove')]");

    private By testButtonCss = By.cssSelector("[c='red']");

    @Given("click add square button")
    public void clickAddButton(){
        driver.findElement(addSquareButton).click();
    }

    @Given("verify that square has been changed")
    @Then("verify that healing appears for changing square")
    public void verifySquareElement() {
        boolean result = driver.findElement(testButtonCss).isEnabled();
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

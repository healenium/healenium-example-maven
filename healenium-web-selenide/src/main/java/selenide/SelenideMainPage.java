package selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SelenideMainPage extends SelenideBasePage{

  private static final By TEST_BUTTON = By.xpath("//button[contains(@class,'default-btn')]");
  private static final By CREATE_MARKUP_BUTTON = By.id("markup-generation-button");
  private static final String URL = "http://sha-test-app.herokuapp.com/";

  public SelenideElement getTestButton(){
    return $(TEST_BUTTON);
  }

  @Step("Click on Test button")
  public SelenideMainPage clickTestButton(){
    getTestButton().click();
    return this;
  }
  @Step("Click on Generate Markup button")
  public SelenideMainPage clickCreateMarkupButton(){
    $(CREATE_MARKUP_BUTTON).click();
    return this;
  }

  @Step("Get text of Test button")
  public String getTestButtonText(){
    return getTestButton().getText();
  }

  @Step("Open Main page")
  public SelenideMainPage openPage(){
    return open(URL, SelenideMainPage.class);
  }

}

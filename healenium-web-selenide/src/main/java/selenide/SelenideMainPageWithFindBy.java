package selenide;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class SelenideMainPageWithFindBy extends SelenideBasePage{

  @FindBy(xpath = "//button[contains(@class,'default-btn')]")
  public SelenideElement testButton;

  @FindBy(id = "markup-generation-button")
  public SelenideElement createMarkupButton;

  private static final String URL = "http://sha-test-app.herokuapp.com/";

  @Step("Click on Test button")
  public void clickTestBtn(){
    testButton.shouldBe(Condition.visible).click();
  }

  @Step("Click on Generate Markup button")
  public void clickCreateMarkupButton(){
    createMarkupButton.shouldBe(Condition.visible).click();
  }

  @Step("Get text of Test button")
  public String getTestButtonText(){
    return testButton.shouldBe(Condition.visible).getText();
  }

  @Step("Open Main page")
  public static SelenideMainPageWithFindBy openPage(){
    return open(URL, SelenideMainPageWithFindBy.class);
  }

}

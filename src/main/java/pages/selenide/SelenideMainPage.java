package pages.selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;

public class SelenideMainPage extends SelenideBasePage{

  private static final By TEST_BUTTON = By.xpath("//button[contains(@class,'default-btn')]");
  private static final By CREATE_MARKUP_BUTTON = By.id("markup-generation-button");
  private static final String URL = "http://sha-test-app.herokuapp.com/";

  public void clickBtn(){
    $(TEST_BUTTON).click();
//    return this;
  }

  public void clickCreateMarkupButton(){
    $(CREATE_MARKUP_BUTTON).click();
//    return this;
  }

  public static SelenideMainPage openPage(){
    return open(URL, SelenideMainPage.class);
  }

}

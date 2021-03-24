package pages.selenide;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class SelenideMainPageWithFindBy extends SelenideBasePage{

  @FindBy(xpath = "//button[contains(@class,'default-btn')]")
  public SelenideElement testButton;

  @FindBy(id = "markup-generation-button")
  public SelenideElement createMarkupButton;

  private static final String URL = "http://sha-test-app.herokuapp.com/";

  public void clickBtn(){
    testButton.click();
//    return this;
  }

  public void clickCreateMarkupButton(){
    createMarkupButton.click();
//    return this;
  }

  public static SelenideMainPageWithFindBy openPage(){
    return open(URL, SelenideMainPageWithFindBy.class);
  }

}

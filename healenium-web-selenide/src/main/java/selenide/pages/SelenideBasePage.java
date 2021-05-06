package selenide.pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class SelenideBasePage {

  @Step("Confirm alert")
  public void confirmAlert(){
    Selenide.switchTo().alert().accept();
  }

  @Step("Get alert text")
  public String getAlertText(){
    return Selenide.switchTo().alert().getText();
  }

  @Step("Refresh page")
  public void refreshPage(){
    Selenide.refresh();
  }

}

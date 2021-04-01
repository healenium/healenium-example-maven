package selenide;

import com.codeborne.selenide.Selenide;

public class SelenideBasePage {
  public void confirmAlert(){
    Selenide.switchTo().alert().accept();
  }

  public String getAlertText(){
    return Selenide.switchTo().alert().getText();
  }


  public void refreshPage(){
    Selenide.refresh();
  }

}

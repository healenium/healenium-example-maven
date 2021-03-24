package pages.selenide;

import com.codeborne.selenide.Selenide;

public class SelenideBasePage {
  public void confirmAlert(){
    Selenide.switchTo().alert().accept();
  }

  public void refreshPage(){
    Selenide.refresh();
  }

}

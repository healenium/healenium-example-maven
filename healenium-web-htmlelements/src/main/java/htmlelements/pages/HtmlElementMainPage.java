package htmlelements.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class HtmlElementMainPage {
  private MarkupGeneratorSection markupGeneratorSection;

  public HtmlElementMainPage(WebDriver driver){
    HtmlElementLoader.populatePageObject(this, driver);
  }

  @Step("Click test button")
  public void clickTestButton(){
    markupGeneratorSection.clickTestButton();
  }

  @Step("Generate Markup")
  public void clickMarkupBtn(){
    markupGeneratorSection.clickMarkupBtn();
  }

}

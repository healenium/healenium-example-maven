package htmlelements.pages;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class HtmlElementMainPage {
  private MarkupGeneratorSection markupGeneratorSection;

  public HtmlElementMainPage(WebDriver driver){
    HtmlElementLoader.populatePageObject(this, driver);
  }

  public void clickTestButton(){
    markupGeneratorSection.clickTestButton();
  }

  public void clickMarkupBtn(){
    markupGeneratorSection.clickMarkupBtn();
  }

  public boolean isTestButtonTextCorrect(String expectedText){
    return expectedText.equals(markupGeneratorSection.getTestButtonText());
  }
}

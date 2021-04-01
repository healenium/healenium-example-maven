package pages.htmlelements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindBy(xpath = "(//div[@class='sections'])[1]")
public class MarkupGeneratorSection extends HtmlElement {

  @FindBy(xpath = "//button[contains(@class,'default-btn')]")
  public Button testButton;

  @FindBy(id = "markup-generation-button")
  public Button markupButton;

  public void clickTestButton(){
    testButton.click();
  }

  public String getTestButtonText(){
    return testButton.getText();
  }

  public void clickMarkupBtn(){
    markupButton.click();
  }
}

package selenoid.pages;


import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.annotation.DisableHealing;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageWithFindBy extends BasePage {

    @FindBy(id = "markup-generation-button")
    WebElement generateMarkupBtnId;

    @FindBy(xpath = "//button[contains(@class,'default-btn')]")
    WebElement testButton;

    @FindBy(id = "for-invisible-test")
    WebElement buttonForInvisible;

    @FindBy(id = "field-parent")
    WebElement fieldParent;

    public MainPageWithFindBy(SelfHealingDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

  public MainPageWithFindBy open() {
        driver.get(mainPageUrl);
        return this;
    }

  public MainPageWithFindBy generateMarkup() {
        generateMarkupBtnId.click();
        return this;
    }

  public MainPageWithFindBy clickTestButton() {
        testButton.click();
        return this;
    }

  @DisableHealing
  public boolean checkLocatorTestButtonDontHealing() {
    try {
      testButton.click();
      return false;
    } catch (NoSuchElementException e) {
      return true;
     }
  }

}

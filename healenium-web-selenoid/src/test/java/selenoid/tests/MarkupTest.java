package selenoid.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import selenoid.pages.MainPage;
import selenoid.pages.MainPageWithFindBy;


public class MarkupTest extends BaseTest {

  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Description("Button click with FindBy annotation")
  public void testButtonClickWithFindByAnnotationPage() {
    MainPageWithFindBy mainPage = new MainPageWithFindBy(driver);
    //find test button
    mainPage.open().clickTestButton();
    //confirm Alert
    mainPage.confirmAlert();

    for (int i = 0; i <= 2; i++) {
      mainPage
          .generateMarkup() //regenerate Markup
          .clickTestButton(); //find test button again
      mainPage.confirmAlert();  //confirm Alert again
    }
  }

  @Test
  @Severity(SeverityLevel.BLOCKER)
  @Description("Button click with findElement annotation")
  public void testButtonClickWithFindElementPage() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open()
        .clickTestButton();
    mainPage.confirmAlert();
    for (int i = 0; i <= 2; i++) {
      mainPage
          .generateMarkup()
          .clickTestButton();
      mainPage.confirmAlert();
    }
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  @Description("Button click with disable healing")
  public void testButtonClickWithDisableHealing() {
    MainPageWithFindBy mainPage = new MainPageWithFindBy(driver);
    mainPage.open()
        .clickTestButton()
        .confirmAlert();
    boolean result = mainPage
        .generateMarkup() //regenerate Markup
        .checkLocatorTestButtonDontHealing(); //find test button again
    assertTrue(result, "The locator was heal");
  }
}

package htmlelements.tests;


import static org.junit.jupiter.api.Assertions.assertTrue;

import htmlelements.pages.HtmlElementMainPage;
import org.junit.jupiter.api.Test;

public class HtmlElementTests extends HtmlElementBaseTest {

  private HtmlElementMainPage mainPage = new HtmlElementMainPage(driver);
  @Test
  public void htmlElementTest(){
    driver.get("http://sha-test-app.herokuapp.com/");
    mainPage.clickTestButton();
    driver.switchTo().alert().accept();

    mainPage.clickMarkupBtn();
    mainPage.clickTestButton();
  }

}

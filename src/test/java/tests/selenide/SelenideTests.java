package tests.selenide;

import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;
import pages.selenide.SelenideMainPage;
import pages.selenide.SelenideMainPageWithFindBy;

public class SelenideTests extends SelenideBaseTest{

  @Test
  public void test(){
    SelenideMainPage mainPage = SelenideMainPage.openPage();

    mainPage.clickBtn();
    mainPage.confirmAlert();
    mainPage.clickCreateMarkupButton();
    mainPage.clickBtn();
    mainPage.confirmAlert();
    mainPage.refreshPage();
  }

  @Test
  public void testFindBy(){
    SelenideMainPageWithFindBy mainPage = SelenideMainPageWithFindBy.openPage();

    mainPage.clickBtn();
    mainPage.confirmAlert();
    mainPage.clickCreateMarkupButton();
    mainPage.clickBtn();
  }

}

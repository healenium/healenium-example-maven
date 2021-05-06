package selenide.tests;

import org.junit.jupiter.api.Test;
import selenide.pages.SelenideMainPage;
import selenide.pages.SelenideMainPageWithFindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelenideTests extends SelenideBaseTest{

  @Test
  public void selenideTest(){
    SelenideMainPage mainPage = new SelenideMainPage();

    mainPage.openPage();
    mainPage.clickTestButton();
    assertTrue(mainPage.getAlertText().contains("button found!"), "Alert text is not correct");

    mainPage.confirmAlert();
    mainPage.clickCreateMarkupButton();

    mainPage.clickTestButton();
    mainPage.confirmAlert();
    mainPage.refreshPage();
  }

  @Test
  public void selenideWithFindByTest(){
    SelenideMainPageWithFindBy mainPage = SelenideMainPageWithFindBy.openPage();
    mainPage.clickTestBtn();
    assertTrue(("button found!").equals(mainPage.getAlertText()),
        "Button text is not correct");
    mainPage.confirmAlert();
    mainPage.clickCreateMarkupButton();
    mainPage.clickTestBtn();
  }

}

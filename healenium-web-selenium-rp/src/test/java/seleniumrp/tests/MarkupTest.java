package seleniumrp.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seleniumrp.pages.MainPage;
import seleniumrp.pages.MainPageWithFindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MarkupTest extends BaseTest {

    @Test
    @DisplayName("Button click with FindBy annotation")
    public void testButtonClickWithFindByAnnotationPage() {
        MainPageWithFindBy mainPage = new MainPageWithFindBy(driver);

        mainPage.open().clickButtonForInvisible().checkThatButtonInvisible();
        //find test button
        mainPage.open().clickTestButton();
        //confirm Alert
        mainPage.confirmAlert();
        screenshot();

        mainPage
                .generateMarkup() //regenerate Markup
                .clickTestButton(); //find test button again
        mainPage.confirmAlert();  //confirm Alert again

    }

    @Test
    @DisplayName("Button click with findElement annotation")
    public void testButtonClickWithFindElementPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open()
                .clickTestButton();
        mainPage.confirmAlert();

        mainPage
                .generateMarkup()
                .clickTestButton(); //should be healed
        mainPage.confirmAlert();

    }

    @Test
    @DisplayName("Button click with disable healing")
    public void testButtonClickWithDisableHealing() {
        MainPageWithFindBy mainPage = new MainPageWithFindBy(driver);
        mainPage.open()
                .clickTestButton()
                .confirmAlert();
        boolean result = mainPage
                .generateMarkup() //regenerate Markup
                .checkLocatorTestButtonDontHealing(); //find test button again
        assertTrue(result, "The locator was not healed");
    }

    @Test
    @DisplayName("Select checkboxes with findElements annotation")
    public void testSelectCheckboxes() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        while (!mainPage.displayedText())
            mainPage.generateMarkup();

        mainPage.selectAllCheckboxes(); //find via findElements

        boolean result = mainPage.verifyFirstCheckbox();  //should be healed
        assertTrue(result, "Locator for checkbox with findElements has been healed");
    }

    @Test
    @DisplayName("Button click with find element by id")
    public void testButtonClickWithId() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open()
                .clickTestButton();
        mainPage.confirmAlert();

        mainPage
                .generateMarkup()
                .clickTestGeneratedButton();  //should be healed
    }

    @Test
    @DisplayName("Select first checkbox and verify using parent:: function in Xpath")
    public void testCheckboxesParentXpath(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open()
                .generateMarkup();

        while (!mainPage.displayedText())
            mainPage.generateMarkup();

        mainPage.selectFirstCheckbox();
        boolean result = mainPage.verifyFirstAccountCheckbox();
        assertTrue(result, "Verify first account checkbox checked");

        mainPage.selectFirstAccountCheckbox();
        result = mainPage.verifyFirstAccountCheckbox(); //should be healed
        assertTrue(result, "Verify first account checkbox unchecked");
    }
}

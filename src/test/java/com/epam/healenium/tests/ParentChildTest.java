package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PagesType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static com.epam.healenium.constants.PagesType.TEST_ENV;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParentChildTest extends BaseTest {

//    @Test
//    @Severity(SeverityLevel.MINOR)
//    @Description("Select first checkbox and verify using parent:: function in Xpath")
//    public void testParentXpath(){
//        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.MARKUP));
//
//        mainPage.openPage()
//                .generateMarkup();
//
//        while (!mainPage.displayedText())
//            mainPage.generateMarkup();
//
//        mainPage.selectFirstCheckbox();
//        boolean result = mainPage.verifyFirstAccountCheckbox();
//        assertTrue(result, "Verify first account checkbox checked");
//
//        mainPage.selectFirstAccountCheckbox();
//        result = mainPage.verifyFirstAccountCheckbox(); //should be healed
//        assertTrue(result, "Verify first account checkbox unchecked");
//    }

//    @Test
//    @Severity(SeverityLevel.MINOR)
//    @Description("Select and verify several inputs via parent.findElement")
//    public void testUnderParentFindElements() {
//        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.MARKUP));
//
//        mainPage.openPage()
//                .generateMarkup();
//
//        while (!mainPage.groupInputEnabled())
//            mainPage.generateMarkup();
//
//        // find all locator and fill them. verify their values
//        mainPage.verifyInputText(); //no healing
//        mainPage.fillInputsGroup();
//        mainPage.verifyInputText(); //should be healed
//    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Select and verify several inputs CSS FirstChild")
    public void testCSSFirstChild(){
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.CSS, "test_tag:first-child")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "test_tag:first-child");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Select and verify several inputs CSS LastChild")
    public void testCSSLastChild(){
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage()
                .findTestElement(LocatorType.CSS, "child_tag:last-child")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "child_tag:last-child");
    }

//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Select first checkbox and verify using parent.findElements in Xpath. " +
//            "The difference between first - not use @DisabledHealing")
//    public void testXPathUnderParentFindElements() {
//        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));
//
//        String parentXpath = "//*[contains(@class,'test-form')]";
//        String childXpath = "//*[@class='input1']";
//        page.openPage()
//                .findElementsUnderParent(parentXpath, childXpath)
//                .clickFormButton()
//                .findElementsUnderParent(parentXpath, childXpath);
//    }
// selenium 4 (above, below, toLeftOf, toRightOf, near)
}

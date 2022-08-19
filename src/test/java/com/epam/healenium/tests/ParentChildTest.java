package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PagesType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class ParentChildTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Select first checkbox and verify using parent:: function in Xpath")
    public void testParentXpath() {
        FrameworkPage testPage = pages.get(String.valueOf(PagesType.TEST_ENV));

        testPage.openPage()
                .findTestElement(LocatorType.XPATH, "(//*[@class='input1']//parent::*[contains(@class, 'input1')])[8]")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "(//*[@class='input1']//parent::*[contains(@class, 'input1')])[8]");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Select and verify several inputs CSS FirstChild")
    public void testCSSFirstChild() {
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.CSS, "test_tag:first-child")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "test_tag:first-child");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Select and verify several inputs CSS LastChild")
    public void testCSSLastChild() {
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.CSS, "child_tag:last-child")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "child_tag:last-child");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Select first checkbox and verify using parent.findElements in Xpath.")
    public void testXPathUnderParentFindElements() {
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        String parentXpath = "//*[contains(@class,'test-form')]";
        String childXpath = "//*[@class='input1']";
        page.openPage()
                .findElementsUnderParent(parentXpath, childXpath)
                .clickFormButton()
                .findElementsUnderParent(parentXpath, childXpath);
    }
// selenium 4 (above, below, toLeftOf, toRightOf, near)
}

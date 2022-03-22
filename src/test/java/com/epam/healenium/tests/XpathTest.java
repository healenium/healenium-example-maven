package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PagesType;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class XpathTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("XPath with special characters")
    public void testXpathSpecialCharacter(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='change:name']")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='change:name']");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @DisplayName("XPath Following")
    public void testXpathFollowing(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_className']/following::test_tag")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_className']/following::test_tag");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("XPath Contains")
    public void testXpathContains(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//input[contains(@class, 'test')]")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//input[contains(@class, 'test')]");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("XPath Not Contains")
    public void testXpathNotContains(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//input[not(contains(@class, 'input1'))]")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//input[not(contains(@class, 'input1'))]");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @DisplayName("XPath Following-Sibling")
    public void testXpathFollowingSibling(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[starts-with(@class, 'test')]/following-sibling::*")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[starts-with(@class, 'test')]/following-sibling::*");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @DisplayName("XPath Ancestor::")
    public void testXPathAncestor(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "(//*[starts-with(@class, 'test')]/ancestor::div[@class='healenium-form validate-form']//input)[1]")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "(//*[starts-with(@class, 'test')]/ancestor::div[@class='healenium-form validate-form']//input)[1]");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @DisplayName("XPath OR")
    public void testXpathOR(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_id' or @id='omg']")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_id' or @id='omg']");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @DisplayName("XPath And")
    public void testXpathAnd(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_id' and @type='text']")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_id' and @type='text']");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("XPath Starts-with")
    public void testXpathStartsWith(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[starts-with(@class, 'test')]")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[starts-with(@class, 'test')]");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @DisplayName("XPath Precending::")
    public void testXpathPrecending(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_className']/preceding::*[@id='change_id']")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='change_className']/preceding::*[@id='change_id']");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @DisplayName("XPath Descendant::")
    public void testXpathDescendant(){
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.XPATH, "//*[@id='descendant_change']/descendant::input")
                .clickSubmitButton()
                .findTestElement(LocatorType.XPATH, "//*[@id='descendant_change']/descendant::input");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @DisplayName("XPath Hover")
    public void testXpathHover(){

    }
}

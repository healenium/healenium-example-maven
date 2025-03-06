package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.epam.healenium.constants.PagesType.TEST_ENV;

public class XpathTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("XPath with special characters")
    public void testXpathSpecialCharacter() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//*[@id='change:name']"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//*[@id='change:name']"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("XPath Following")
    public void testXpathFollowing() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//*[@id='change_className']/following::test_tag"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//*[@id='change_className']/following::test_tag"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("XPath Contains")
    public void testXpathContains() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//input[contains(@class, 'test')]"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//input[contains(@class, 'test')]"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("XPath Not Contains")
    public void testXpathNotContains() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//input[not(contains(@class, 'input1'))]"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//input[not(contains(@class, 'input1'))]"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("XPath Following-Sibling")
    public void testXpathFollowingSibling() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//*[starts-with(@class, 'test')]/following-sibling::*"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//*[starts-with(@class, 'test')]/following-sibling::*"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("XPath Ancestor::")
    public void testXPathAncestor() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("(//*[starts-with(@class, 'test')]/ancestor::div[@class='healenium-form validate-form']//input)[1]"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("(//*[starts-with(@class, 'test')]/ancestor::div[@class='healenium-form validate-form']//input)[1]"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("XPath OR")
    public void testXpathOR() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//*[@id='change_id' or @id='omg']"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//*[@id='change_id' or @id='omg']"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("XPath And")
    public void testXpathAnd() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//*[@id='change_id' and @type='text']"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//*[@id='change_id' and @type='text']"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("XPath Starts-with")
    public void testXpathStartsWith() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//*[starts-with(@class, 'test')]"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//*[starts-with(@class, 'test')]"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("XPath Precending::")
    public void testXpathPrecending() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//*[@id='change_className']/preceding::*[@id='change_id']"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//*[@id='change_className']/preceding::*[@id='change_id']"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("XPath Descendant::")
    public void testXpathDescendant() {
        FrameworkPage page = pages.get(TEST_ENV);

        page.openPage();
        driver.findElement(By.xpath("//*[@id='descendant_change']/descendant::input"));
        page.clickSubmitButton();
        driver.findElement(By.xpath("//*[@id='descendant_change']/descendant::input"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("XPath Hover")
    public void testXpathHover() {

    }
}

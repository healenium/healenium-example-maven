package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.epam.healenium.constants.PagesType.TEST_ENV;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * findElements healing on https://elenastepuro.github.io/test_env/index.html
 *
 * Flow for each test:
 * 1) open page and call findElements → Healenium saves reference paths
 * 2) click "Change locators" → DOM attributes / tags change
 * 3) call the same findElements again → broken members should be healed
 */
public class FindElementsTest extends BaseTest {

    // ── checkbox form (#Submit_checkbox / forParentSubmit) ──────────────────
    // class "input1" → "unchecked1" / "unchecked2" / "unchecked3" on all 3 checkboxes

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("findElements by CSS class under .test-form: all 3 checkboxes lose .input1 after Change locators")
    public void testFindElementsCssClassCheckboxes() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.cssSelector(".test-form input.input1");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(3, before.size(), "Baseline: 3 checkboxes with class input1");

        page.clickFormButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(3, after.size(), "After Change locators: 3 checkboxes should be healed");
        after.forEach(el -> assertNotNull(el.getAttribute("id")));
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("findElements by XPath class under .test-form after Change locators")
    public void testFindElementsXpathClassCheckboxes() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.xpath("//*[contains(@class,'test-form')]//*[@class='input1']");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(3, before.size(), "Baseline: 3 elements with class input1");

        page.clickFormButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(3, after.size(), "After Change locators: elements should be healed");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("parent.findElements: find checkboxes under .test-form parent after Change locators")
    public void testParentFindElementsCheckboxes() {
        FrameworkPage page = pages.get(TEST_ENV);
        String parentXpath = "//*[contains(@class,'test-form')]";
        String childXpath = "//*[@class='input1']";

        page.openPage()
                .findElementsUnderParent(parentXpath, childXpath)
                .clickFormButton()
                .findElementsUnderParent(parentXpath, childXpath);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("findElements by CSS id list for form checkboxes — ids stay, class changes; size must stay 3")
    public void testFindElementsByCheckboxIds() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.cssSelector(
                "#form_checked1, #form_checked2, #form_checked3");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(3, before.size());

        page.clickFormButton();

        // ids are unchanged by forParentSubmit — no healing needed, still 3
        List<WebElement> after = driver.findElements(locator);
        assertEquals(3, after.size());
    }

    // ── main form (#Submit / showValidate) ──────────────────────────────────
    // individual field locators break; findElements should heal missing members

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("findElements by CSS id #change_id after Change locators (id → newValue)")
    public void testFindElementsCssId() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.cssSelector("#change_id");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(1, before.size());

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(1, after.size(), "Element with changed id should be healed");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("findElements by CSS class .test_class after Change locators (class → newClass)")
    public void testFindElementsCssClassName() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.cssSelector(".test_class");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(1, before.size());

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(1, after.size(), "Element with changed class should be healed");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("findElements by tagName test_tag after Change locators (test_tag → input)")
    public void testFindElementsByTagName() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.tagName("test_tag");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(1, before.size());

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(1, after.size(), "Element with changed tag should be healed");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("findElements by name change_name after Change locators (name → newName)")
    public void testFindElementsByName() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.name("change_name");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(1, before.size());

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(1, after.size(), "Element with changed name should be healed");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("findElements by linkText after Change locators (text → 'New text here')")
    public void testFindElementsByLinkText() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.linkText("Change: LinkText, PartialLinkText");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(1, before.size());

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(1, after.size(), "Link with changed text should be healed");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("findElements by partialLinkText after Change locators")
    public void testFindElementsByPartialLinkText() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.partialLinkText("LinkText");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(1, before.size());

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(1, after.size(), "Link with changed text should be healed");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("findElements by CSS :disabled after Change locators (disabled → enabled)")
    public void testFindElementsCssDisabled() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.cssSelector("#main_form input:disabled");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(1, before.size());

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(1, after.size(), "Former disabled input should be healed");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("findElements by CSS :checked after Change locators (checked → unchecked)")
    public void testFindElementsCssChecked() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.cssSelector("#main_form input:checked");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(1, before.size());

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(1, after.size(), "Former checked input should be healed");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("findElements by XPath id with special character after Change locators")
    public void testFindElementsXpathSpecialCharacter() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.xpath("//*[@id='change:name']");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(1, before.size());

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(1, after.size(), "Element with id change:name → newName should be healed");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("findElements compound CSS: all members break after Change locators → heal entire set")
    public void testFindElementsFullHealCompoundCss() {
        FrameworkPage page = pages.get(TEST_ENV);
        By locator = By.cssSelector(
                "#change_id, .test_class, test_tag, #change\\:name, textarea:enabled");

        page.openPage();

        List<WebElement> before = driver.findElements(locator);
        assertEquals(5, before.size(), "Baseline: 5 distinct fields");

        page.clickSubmitButton();

        List<WebElement> after = driver.findElements(locator);
        assertEquals(5, after.size(),
                "After Change locators: all 5 missing members should be healed");
    }
}

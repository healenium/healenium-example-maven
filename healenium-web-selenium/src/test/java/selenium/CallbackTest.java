package selenium;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import selenium.pages.CallbackTestPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CallbackTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Update locator for element from shadow root")
    public void testElementFromShadowRoot() {
        CallbackTestPage callbackTestPage = new CallbackTestPage(driver);
        boolean result = callbackTestPage
                .open()
                .clickAddSquareButton()
                .verifyShadowElement();
        assertTrue(result, "Element in shadowRoot enabled");

        for (int i = 0; i <= 2; i++) {
            result = callbackTestPage
                    .clickUpdateSquareButton()
                    .verifyShadowElement(); //should be healed
            assertTrue(result, "Element in shadowRoot was healed");
        }
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css selector")
    public void testCssLocators() {
        CallbackTestPage callbackTestPage = new CallbackTestPage(driver);
        boolean result = callbackTestPage
                .open()
                .clickAddSquareButton()
                .verifySquareElement();
        assertTrue(result, "Element with css enabled");

        for (int i = 0; i <= 2; i++) {
            result = callbackTestPage
                    .clickUpdateSquareButton()
                    .verifySquareElement(); //should be healed
            assertTrue(result, "Element with css was healed");
        }
    }
}

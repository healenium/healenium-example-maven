package seleniumrp.tests;

import com.epam.reportportal.annotations.attribute.Attribute;
import com.epam.reportportal.annotations.attribute.Attributes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seleniumrp.pages.CallbackTestPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CallbackTest extends BaseTest {

    @Test
    @Attributes(attributes = {@Attribute(key = "healing", value = "true")})
    @DisplayName("Update locator for element from shadow root")
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
    @Attributes(attributes = {@Attribute(key = "healing", value = "true")})
    @DisplayName("Update locator for element with css selector")
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

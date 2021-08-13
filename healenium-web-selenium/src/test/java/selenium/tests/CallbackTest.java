package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import selenium.pages.CallbackTestPage;

public class CallbackTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Update locator for element from shadow root")
    public void testElementFromShadowRoot() {
        CallbackTestPage callbackTestPage = new CallbackTestPage(driver);
        callbackTestPage
                .open()
                .clickAddSquareButton()
                .verifyShadowElement();

        for (int i = 0; i <= 2; i++) {
            callbackTestPage
                    .clickUpdateSquareButton()
                    .verifyShadowElement();
        }
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Update locator for element with css selector")
    public void testCssLocators(){
        CallbackTestPage callbackTestPage = new CallbackTestPage(driver);
        callbackTestPage
                .open()
                .clickAddSquareButton()
                .verifySquareElement();

        for (int i = 0; i <= 2; i++) {
            callbackTestPage
                    .clickUpdateSquareButton()
                    .verifySquareElement();
        }
    }
}

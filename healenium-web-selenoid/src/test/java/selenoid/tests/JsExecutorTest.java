package selenoid.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import selenoid.pages.CallbackTestPage;

public class JsExecutorTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Verify elements in shadowRoot")
    public void testShadow() {
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
}

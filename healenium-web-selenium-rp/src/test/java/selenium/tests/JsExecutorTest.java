package selenium.tests;

import com.epam.reportportal.annotations.attribute.Attribute;
import com.epam.reportportal.annotations.attribute.Attributes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.pages.CallbackTestPage;

public class JsExecutorTest extends BaseTest {

    @Test
    @Attributes(attributes = { @Attribute(key = "healing", value = "true") })
    @DisplayName("Verify elements in shadowRoot")
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

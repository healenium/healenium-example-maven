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


//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Button click using different types of locators")
//    public void testButtonClickWithDiffLocators(){
//        CallbackTestPage callbackTestPage = new CallbackTestPage(driver);
//        callbackTestPage
//                .open()
//                .clickAddSquareButtonClassName()
//                .clickRemoveSquareButton();
//        callbackTestPage
//                .clickAddSquareButtonCss()
//                .clickRemoveSquareButton();
////            .put("By.className", By::className)
////            .put("By.cssSelector", By::cssSelector)
////            .put("By.xpath", By::xpath)
////            .put("By.tagName", By::tagName)
////            .put("By.name", By::name)
////            .put("By.partialLinkText", By::partialLinkText)
////            .put("By.linkText", By::linkText)
////            .put("By.id", By::id)
//    }

}

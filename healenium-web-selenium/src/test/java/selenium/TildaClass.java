package selenium;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import selenium.pages.TildaPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TildaClass extends BaseTest {
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Locators with special character ':' ")
    public void testElementFromShadowRoot() {
        TildaPage tilda = new TildaPage(driver);

        String someName = "Name";
        tilda.open()
                .inputName(someName);
        boolean res=tilda.checkFillName(someName);
        assertTrue(res, "Check input field has been changed");
    }
}

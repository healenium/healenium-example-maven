package util;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.tests.BaseTest;
import org.junit.jupiter.api.Test;

import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.elements.init.UIFactory.$;

public class Utils extends BaseTest {

    @Test
    public void loginSimpleTest() {
        openUrl("https://jdi-testing.github.io/jdi-light/");
        $("img#user-icon").click();
        $("#name").sendKeys("Roman");
        $("#password").sendKeys("Jdi1234");
        $("#login-button").click();
        $("#user-name").is().displayed();
    }

    @Test
    public void testButtonClickWithId() {
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.ID, "change_id")
                .clickSubmitButton()
                .findTestElement(LocatorType.ID, "change_id");
    }
}
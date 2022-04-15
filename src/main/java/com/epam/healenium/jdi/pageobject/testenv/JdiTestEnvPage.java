package com.epam.healenium.jdi.pageobject.testenv;

import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.jdi.pageobject.JdiBasePage;
import com.epam.healenium.jdi.search.Context;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.smart.SId;
import com.epam.jdi.light.elements.pageobjects.annotations.smart.Smart;
import com.epam.jdi.light.ui.html.elements.common.Button;
import org.openqa.selenium.WebDriver;

import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Smart
public class JdiTestEnvPage extends JdiBasePage {

    @UI("#Submit")
    private UIElement submitButton;
    @UI("Submit_checkbox")
    private Button formButton;

    public JdiTestEnvPage(){
        initElements();
    }

    public JdiTestEnvPage openPage(){
        openUrl(String.valueOf(PageUrl.TEST_ENV_URL));
        return this;
    }

    public JdiTestEnvPage findTestElement(LocatorType type, String selector) {
        boolean result = new Context(type).executeStrategy(selector);
        assertTrue(result);
        return this;
    }

    public JdiTestEnvPage clickSubmitButton() {
        $("#Submit").click();
//        submitButton.click();
        return this;
    }

    public JdiTestEnvPage clickFormButton(){
        formButton.click();
        return this;
    }

    public JdiTestEnvPage findTestElements(String locators){
//        List<Checkbox> formElement=
//                formElements.forEach(f -> f.click());
        return this;
    }
}

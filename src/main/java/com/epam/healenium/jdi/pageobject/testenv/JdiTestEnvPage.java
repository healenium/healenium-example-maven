package com.epam.healenium.jdi.pageobject.testenv;

import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.jdi.pageobject.JdiBasePage;
import com.epam.healenium.jdi.search.Context;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class JdiTestEnvPage extends JdiBasePage {

    @UI("Submit")
    private Button submitButton;
    @UI("Submit_checkbox")
    private Button formButton;

    public JdiTestEnvPage openPage(){
        WebPage.openUrl(String.valueOf(PageUrl.TEST_ENV_URL));
        return this;
    }

    public JdiTestEnvPage findTestElement(LocatorType type, String selector) {
        boolean result = new Context(type).executeStrategy(selector);
        assertTrue(result);
        return this;
    }

    public JdiTestEnvPage clickSubmitButton() {
        submitButton.click();
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

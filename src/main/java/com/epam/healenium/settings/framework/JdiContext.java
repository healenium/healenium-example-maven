package com.epam.healenium.settings.framework;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.jdi.pageobject.testenv.JdiTestEnvPage;
import com.epam.healenium.settings.IFrameworkInterface;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

import static com.epam.jdi.light.elements.init.PageFactory.initElements;

public class JdiContext implements IFrameworkInterface {
    private WebDriver driver;

    public JdiContext(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public HashMap<String, FrameworkPage> useSettings() {
        HashMap<String, FrameworkPage> jdiContext = new HashMap<>();
        jdiContext.put(String.valueOf(PagesType.TEST_ENV), new JdiTestEnvPage());

        return jdiContext;
    }
}

package com.epam.healenium.settings;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.FrameworkType;
import com.epam.healenium.settings.framework.SelenideContext;
import com.epam.healenium.settings.framework.SeleniumContext;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class FrameworkContext {

    private IFrameworkInterface type;

    public FrameworkContext(FrameworkType type, WebDriver driver) {
        switch (type) {
            case SELENIUM:
                this.type = new SeleniumContext(driver);
                break;
            case SELENIDE:
                this.type = new SelenideContext(driver);
                break;
            default:
                break;
        }
    }

    public HashMap<String, FrameworkPage> setFramework() {
        return this.type.useSettings();
    }
}

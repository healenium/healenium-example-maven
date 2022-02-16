package com.epam.healenium.settings;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.constants.FrameworkType;
import com.epam.healenium.settings.framework.JdiContext;
import com.epam.healenium.settings.framework.SelenideContext;
import com.epam.healenium.settings.framework.SeleniumContext;

import java.util.HashMap;

public class FrameworkContext {

    private FrameworkStrategy type;

    public FrameworkContext(FrameworkType type, SelfHealingDriver driver) {
        switch (type) {
            case SELENIUM:
                this.type = new SeleniumContext(driver);
                break;
            case SELENIDE:
                this.type = new SelenideContext(driver);
                break;
            case JDI:
                this.type = new JdiContext(driver);
                break;
            default:
                break;
        }
    }

    public HashMap<String, FrameworkPage> setFramework() {
        return this.type.useSettings();
    }
}

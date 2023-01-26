package com.epam.healenium.settings.framework;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.settings.IFrameworkInterface;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class JdiContext implements IFrameworkInterface {
    private WebDriver driver;

    public JdiContext(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public HashMap<PagesType, FrameworkPage> useSettings() {
        return null;
    }
}

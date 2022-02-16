package com.epam.healenium.settings.framework;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.selenium.pageobject.callback.CallbackPage;
import com.epam.healenium.selenium.pageobject.markup.MainPageWithFindBy;
import com.epam.healenium.selenium.pageobject.markup.MarkupPage;
import com.epam.healenium.selenium.pageobject.testenv.TestEnvPage;
import com.epam.healenium.settings.FrameworkStrategy;

import java.util.HashMap;

public class SeleniumContext implements FrameworkStrategy {
    private SelfHealingDriver driver;

    public SeleniumContext(SelfHealingDriver driver) {
        this.driver = driver;
    }

    @Override
    public HashMap<String, FrameworkPage> useSettings() {
        HashMap<String, FrameworkPage> seleniumContext = new HashMap<>();
        seleniumContext.put(String.valueOf(PagesType.TEST_ENV), new TestEnvPage(this.driver));
        seleniumContext.put(String.valueOf(PagesType.MARKUP), new MarkupPage(this.driver));
        seleniumContext.put(String.valueOf(PagesType.MARKUP_FIND_BY), new MainPageWithFindBy(this.driver));
        seleniumContext.put(String.valueOf(PagesType.CALLBACK), new CallbackPage(this.driver));

        return seleniumContext;
    }
}

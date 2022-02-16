package com.epam.healenium.settings.framework;

import com.codeborne.selenide.WebDriverRunner;
import com.epam.healenium.FrameworkPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.selenide.pageobject.markup.SelenideMainPageWithFindBy;
import com.epam.healenium.selenide.pageobject.markup.SelenideMarkupPage;
import com.epam.healenium.selenide.pageobject.callback.SelenideCallbackPage;
import com.epam.healenium.selenide.pageobject.testenv.SelenideTestEnvPage;
import com.epam.healenium.settings.FrameworkStrategy;

import java.util.HashMap;

public class SelenideContext implements FrameworkStrategy {

    public SelenideContext(SelfHealingDriver driver) {
        WebDriverRunner.setWebDriver(driver);
    }

    @Override
    public HashMap<String, FrameworkPage> useSettings() {
        HashMap<String, FrameworkPage> selenideContext = new HashMap<>();

        selenideContext.put(String.valueOf(PagesType.TEST_ENV), new SelenideTestEnvPage());
        selenideContext.put(String.valueOf(PagesType.CALLBACK), new SelenideCallbackPage());
        selenideContext.put(String.valueOf(PagesType.MARKUP), new SelenideMarkupPage());
        selenideContext.put(String.valueOf(PagesType.MARKUP_FIND_BY), new SelenideMainPageWithFindBy());

        return selenideContext;
    }
}

package com.epam.healenium.settings.framework;

import com.codeborne.selenide.WebDriverRunner;
import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.selenide.pageobject.markup.SelenideMainPageWithFindBy;
import com.epam.healenium.selenide.pageobject.markup.SelenideMarkupPage;
import com.epam.healenium.selenide.pageobject.callback.SelenideCallbackPage;
import com.epam.healenium.selenide.pageobject.testenv.SelenideTestEnvPage;
import com.epam.healenium.settings.IFrameworkInterface;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

import static com.epam.healenium.constants.PagesType.CALLBACK;
import static com.epam.healenium.constants.PagesType.MARKUP;
import static com.epam.healenium.constants.PagesType.MARKUP_FIND_BY;
import static com.epam.healenium.constants.PagesType.TEST_ENV;

public class SelenideContext implements IFrameworkInterface {

    public SelenideContext(WebDriver driver) {
        WebDriverRunner.setWebDriver(driver);
    }

    @Override
    public HashMap<PagesType, FrameworkPage> useSettings() {
        HashMap<PagesType, FrameworkPage> selenideContext = new HashMap<>();

        selenideContext.put(TEST_ENV, new SelenideTestEnvPage());
        selenideContext.put(CALLBACK, new SelenideCallbackPage());
        selenideContext.put(MARKUP, new SelenideMarkupPage());
        selenideContext.put(MARKUP_FIND_BY, new SelenideMainPageWithFindBy());

        return selenideContext;
    }
}

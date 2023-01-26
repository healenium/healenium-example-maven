package com.epam.healenium.settings.framework;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.selenium.pageobject.callback.CallbackPage;
import com.epam.healenium.selenium.pageobject.markup.MainPageWithFindBy;
import com.epam.healenium.selenium.pageobject.markup.MarkupPage;
import com.epam.healenium.selenium.pageobject.testenv.TestEnvPage;
import com.epam.healenium.settings.IFrameworkInterface;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

import static com.epam.healenium.constants.PagesType.CALLBACK;
import static com.epam.healenium.constants.PagesType.MARKUP;
import static com.epam.healenium.constants.PagesType.MARKUP_FIND_BY;
import static com.epam.healenium.constants.PagesType.TEST_ENV;

public class SeleniumContext implements IFrameworkInterface {
    private WebDriver driver;

    public SeleniumContext(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public HashMap<PagesType, FrameworkPage> useSettings() {
        HashMap<PagesType, FrameworkPage> seleniumContext = new HashMap<>();
        seleniumContext.put(TEST_ENV, new TestEnvPage(this.driver));
        seleniumContext.put(MARKUP, new MarkupPage(this.driver));
        seleniumContext.put(MARKUP_FIND_BY, new MainPageWithFindBy(this.driver));
        seleniumContext.put(CALLBACK, new CallbackPage(this.driver));

        return seleniumContext;
    }
}

package com.epam.healenium.selenium.search;

import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.selenium.search.locators.*;
import org.openqa.selenium.WebDriver;

public class Context {
    private Strategy strategy;

    public Context(WebDriver driver, LocatorType type) {
        switch (type) {
            case XPATH:
                this.strategy = new XPathStrategy(driver);
                break;
            case CSS:
                this.strategy = new CssStrategy(driver);
                break;
            case ID:
                this.strategy = new IdStrategy(driver);
                break;
            case CLASS_NAME:
                this.strategy = new ClassNameStrategy(driver);
                break;
            case LINK_TEXT:
                this.strategy = new LinkTextStrategy(driver);
                break;
            case PARTIAL_LINK_TEXT:
                this.strategy = new PartialLinkStrategy(driver);
                break;
            case TAG_NAME:
                this.strategy = new TagStrategy(driver);
                break;
            case NAME:
                this.strategy = new NameStrategy(driver);
                break;
        }
    }

    public boolean executeStrategy(String selector) {
        return strategy.doAction(selector);
    }
}

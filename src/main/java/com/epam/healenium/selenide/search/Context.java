package com.epam.healenium.selenide.search;

import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.selenide.search.locators.*;

public class Context {
    private SelenideStrategy strategy;

    public Context(LocatorType type) {
        switch (type) {
            case XPATH:
                this.strategy = new SelenideXPathStrategy();
                break;
            case CSS:
                this.strategy = new SelenideCssStrategy();
                break;
            case ID:
                this.strategy = new SelenideIdStrategy();
                break;
            case CLASS_NAME:
                this.strategy = new SelenideClassNameStrategy();
                break;
            case LINK_TEXT:
                this.strategy = new SelenideLinkTextStrategy();
                break;
            case PARTIAL_LINK_TEXT:
                this.strategy = new SelenidePartialLinkStrategy();
                break;
            case TAG_NAME:
                this.strategy = new SelenideTagStrategy();
                break;
            case NAME:
                this.strategy = new SelenideNameStrategy();
                break;
        }
    }

    public boolean executeStrategy(String selector) {
        return strategy.doAction(selector);
    }
}

package com.epam.healenium.jdi.search;

import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.jdi.search.locators.*;

public class Context {
    private JdiStrategy strategy;

    public Context(LocatorType type) {
        switch (type) {
            case XPATH:
                this.strategy = new JdiXPathStrategy();
                break;
            case CSS:
                this.strategy = new JdiCssStrategy();
                break;
            case ID:
                this.strategy = new JdiIdStrategy();
                break;
            case CLASS_NAME:
                this.strategy = new JdiClassNameStrategy();
                break;
            case LINK_TEXT:
                this.strategy = new JdiLinkTextStrategy();
                break;
            case PARTIAL_LINK_TEXT:
                this.strategy = new JdiPartialLinkStrategy();
                break;
            case TAG_NAME:
                this.strategy = new JdiTagStrategy();
                break;
            case NAME:
                this.strategy = new JdiNameStrategy();
                break;
        }
    }

    public boolean executeStrategy(String selector) {
        return strategy.doAction(selector);
    }
}

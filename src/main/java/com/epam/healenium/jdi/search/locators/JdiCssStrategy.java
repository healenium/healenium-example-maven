package com.epam.healenium.jdi.search.locators;

import com.epam.healenium.jdi.search.JdiStrategy;

import static com.epam.jdi.light.elements.init.UIFactory.$;

public class JdiCssStrategy implements JdiStrategy {
    @Override
    public boolean doAction(String selector) {
        return $(selector).isDisplayed();
    }
}

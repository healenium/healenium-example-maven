package com.epam.healenium.jdi.search.locators;

import com.epam.healenium.jdi.search.JdiStrategy;

public class JdiPartialLinkStrategy implements JdiStrategy {
    @Override
    public boolean doAction(String selector) {
        return false;
    }
}

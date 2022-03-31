package com.epam.healenium.jdi.search.locators;

import com.epam.healenium.jdi.search.JdiStrategy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.TextField;

public class JdiIdStrategy implements JdiStrategy {

    @UI("change_id")
    private TextField idField;

    @Override
    public boolean doAction(String selector) {
        if ("change_id" == selector)
            return idField.isDisabled();
        return false;
    }
}

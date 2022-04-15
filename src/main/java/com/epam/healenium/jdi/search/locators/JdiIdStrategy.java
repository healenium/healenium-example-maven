package com.epam.healenium.jdi.search.locators;

import com.epam.healenium.jdi.search.JdiStrategy;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.TextField;


import static com.epam.jdi.light.elements.init.UIFactory.$;

public class JdiIdStrategy implements JdiStrategy {

    @UI("change_id")
    private UIElement idField;

    @Override
    public boolean doAction(String selector) {
//        if ("change_id" == selector)
//            return $(selector).isDisplayed();
//            return idField.isDisplayed();
        UIElement id=$("#change_id");
        boolean res=id.isDisplayed();
        return res;
    }
}

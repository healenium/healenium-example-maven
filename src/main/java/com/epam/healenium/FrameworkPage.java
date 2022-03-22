package com.epam.healenium;

import com.epam.healenium.constants.LocatorType;

public interface FrameworkPage {

    FrameworkPage openPage();

    FrameworkPage findTestElement(LocatorType css, String s);

    FrameworkPage clickSubmitButton();

    FrameworkPage clickAddSquareButton();

    FrameworkPage clickUpdateSquareButton();

    boolean verifySquareElement();

    FrameworkPage clickTestButton();

    FrameworkPage confirmAlert();

    FrameworkPage generateMarkup();

    boolean displayedText();

    boolean checkLocatorTestButtonDontHealing();

    FrameworkPage selectFirstCheckbox();

    boolean verifyFirstAccountCheckbox();

    FrameworkPage selectFirstAccountCheckbox();

    boolean groupInputEnabled();

    void verifyInputText();

    void fillInputsGroup();

    FrameworkPage clickTestButtonWaitor(int i);

    FrameworkPage findElementsUnderParent(String parentXpath, String childXpath);

    FrameworkPage clickFormButton();

    FrameworkPage findTestElements(String s);
}

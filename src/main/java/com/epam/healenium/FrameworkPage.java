package com.epam.healenium;

import com.epam.healenium.constants.LocatorType;

import java.io.FileReader;

public abstract class FrameworkPage {

    public FrameworkPage openPage() {
        return null;
    }

    public FrameworkPage findTestElement(LocatorType css, String s) {
        return null;
    }

    public FrameworkPage clickSubmitButton() {
        return null;
    }

    public FrameworkPage clickAddSquareButton() {
        return null;
    }

    public FrameworkPage clickUpdateSquareButton() {
        return null;
    }

    public boolean verifySquareElement() {
        return false;
    }

    public FrameworkPage clickTestButton() {
        return null;
    }

    public FrameworkPage confirmAlert() {
        return null;
    }
    public FrameworkPage clickElementByChangeID() {
        return null;
    }

    public FrameworkPage clickElementByChangeClassName() {
        return null;
    }

    public FrameworkPage clickElementByChangeTagName() {
        return null;
    }

    public FrameworkPage clickElementByChangeName() {
        return null;
    }

    public FrameworkPage findElementByChangeLinkText() {
        return null;
    }

    public FrameworkPage findCheckBox1() {
        return null;
    }

    public FrameworkPage findCheckBox2() {
        return null;
    }

    public FrameworkPage findCheckBox3() {
        return null;
    }

    public FrameworkPage clickSubmitButtonForCheckBox() {
        return null;
    }

    public FrameworkPage findElementEnableToDisable() {
        return null;
    }

    public FrameworkPage findCheckBoxEnableToDisable() {
        return null;
    }

    public FrameworkPage generateMarkup() {
        return null;
    }

    public boolean displayedText() {
        return false;
    }

    public int selectAllCheckboxes() {
        return 0;
    }

    public int verifyAllCheckboxesChecked() {
        return 0;
    }

    public int verifyAllCheckboxesUnchecked() {
        return 0;
    }

    public boolean checkLocatorTestButtonDontHealing() {
        return false;
    }

    public FrameworkPage selectFirstCheckbox() {
        return null;
    }

    public boolean verifyFirstAccountCheckbox() {
        return false;
    }

    public FrameworkPage selectFirstAccountCheckbox() {
        return null;
    }

    public boolean groupInputEnabled() {
        return false;
    }

    public void verifyInputText() {
    }

    public void fillInputsGroup() {
    }

    public boolean testButtonEnable() {
        return false;
    }

    public FrameworkPage clickTestGeneratedButton() {
        return null;
    }

    public FrameworkPage clickTestButtonWaitor(int i) {
        return null;
    }

    public FrameworkPage findElementsUnderParent(String parentXpath, String childXpath) {
        return null;
    }

    public FrameworkPage clickFormButton() {
        return null;
    }
}

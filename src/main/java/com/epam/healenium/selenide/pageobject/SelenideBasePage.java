package com.epam.healenium.selenide.pageobject;

import com.codeborne.selenide.Selenide;
import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;

import static com.codeborne.selenide.Selenide.page;

public class SelenideBasePage implements FrameworkPage {

    @Override
    public FrameworkPage openPage() {
        return null;
    }

    @Override
    public FrameworkPage findTestElement(LocatorType css, String s) {
        return null;
    }

    @Override
    public FrameworkPage clickSubmitButton() {
        return null;
    }

    @Override
    public FrameworkPage clickAddSquareButton() {
        return null;
    }

    @Override
    public FrameworkPage clickUpdateSquareButton() {
        return null;
    }

    @Override
    public boolean verifySquareElement() {
        return false;
    }

    @Override
    public FrameworkPage clickTestButton() {
        return null;
    }

    public SelenideBasePage confirmAlert(){
        Selenide.switchTo().alert().accept();
        return page(SelenideBasePage.class);
    }

    @Override
    public FrameworkPage generateMarkup() {
        return null;
    }

    @Override
    public boolean displayedText() {
        return false;
    }

    @Override
    public boolean checkLocatorTestButtonDontHealing() {
        return false;
    }

    @Override
    public FrameworkPage selectFirstCheckbox() {
        return null;
    }

    @Override
    public boolean verifyFirstAccountCheckbox() {
        return false;
    }

    @Override
    public FrameworkPage selectFirstAccountCheckbox() {
        return null;
    }

    @Override
    public boolean groupInputEnabled() {
        return false;
    }

    @Override
    public void verifyInputText() {

    }

    @Override
    public void fillInputsGroup() {

    }

    @Override
    public FrameworkPage clickTestButtonWaitor(int i) {
        return null;
    }

    @Override
    public FrameworkPage findElementsUnderParent(String parentXpath, String childXpath) {
        return null;
    }

    @Override
    public FrameworkPage clickFormButton() {
        return null;
    }

    @Override
    public FrameworkPage findTestElements(String s) {
        return null;
    }

    public String getAlertText(){
        return Selenide.switchTo().alert().getText();
    }

    public void refreshPage(){
        Selenide.refresh();
    }
}

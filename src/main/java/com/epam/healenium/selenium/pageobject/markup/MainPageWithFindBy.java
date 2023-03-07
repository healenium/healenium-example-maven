package com.epam.healenium.selenium.pageobject.markup;

import com.epam.healenium.annotation.DisableHealing;
import com.epam.healenium.selenium.pageobject.SeleniumBasePage;
import com.epam.healenium.selenium.pageobject.testenv.TestEnvPage;
import io.qameta.allure.Step;
import org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.TagName;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageWithFindBy extends SeleniumBasePage {

    @FindBy(id = "markup-generation-button")
    WebElement generateMarkupBtnId;

    @FindBy(xpath = "//button[@id='submit_alert']")
    WebElement testButton;

    @FindBy(id = "for-invisible-test")
    WebElement buttonForInvisible;

    @FindBy(id = "field-parent")
    WebElement fieldParent;

    @FindBy(id = "change_id")
    WebElement inputFieldChangeID;


    @FindBy(id = "Submit")
    WebElement submitButton;

    @FindBy(className = "test_class")
    WebElement inputFieldChangeClassName;

    @FindBy(xpath ="//test_tag/following-sibling::input")
    WebElement inputFieldChangeTagName;

    @FindBy (name =  "change_name")
    WebElement inputFieldChangeName;
    @FindBy (linkText = "Change: LinkText, PartialLinkText")
    WebElement inputFieldChangeLinkText;

    @FindBy(id = "form_checked1")
    WebElement checkBox1;

    @FindBy(id = "form_checked2")
    WebElement checkBox2;

    @FindBy(id = "form_checked3")
    WebElement checkBox3;

    @FindBy(id = "Submit_checkbox")
    WebElement submitButton1;

    @FindBy(id = "change_enabled")
    WebElement InputFieldEnableTODisable;

    @FindBy(id = "change_checked")
    WebElement checkBoxEnableToDisable;

    public MainPageWithFindBy(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Open Main page")
    public MainPageWithFindBy openPage() {
        driver.get(mainPageUrl);
        return this;
    }

    @Step("Generate markup")
    public MainPageWithFindBy generateMarkup() {
        generateMarkupBtnId.click();
        return this;
    }

    @Step("Click test button")
    public MainPageWithFindBy clickTestButton() {
        testButton.click();
        return this;
    }

    public MainPageWithFindBy clickButtonForInvisible() {
        buttonForInvisible.click();
        return this;
    }

    public boolean checkThatButtonInvisible() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(1))
                    .until(ExpectedConditions.invisibilityOf(buttonForInvisible));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public MainPageWithFindBy hoverOnTestButton() {
        Actions action = new Actions(driver);
        action.moveToElement(testButton).perform();
        return this;
    }

    public String takeValueFromSecondButton() {
        return fieldParent
                .findElement(By.xpath(".//input"))
                .getAttribute("Value");
    }

    public String getAttributeFromTestButton(String attribute) {
        return testButton.getAttribute(attribute);
    }

    @DisableHealing
    public boolean checkLocatorTestButtonDontHealing() {
        try {
            testButton.click();
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    @Step("Find and click InputFiled for Change ID")
    public MainPageWithFindBy clickElementByChangeID() {
        inputFieldChangeID.click();
        return this;
    }

    public MainPageWithFindBy clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public MainPageWithFindBy clickElementByChangeClassName(){
        inputFieldChangeClassName.click();
        return this;
    }

    public MainPageWithFindBy clickElementByChangeTagName() {
        inputFieldChangeTagName.click();
        return this;
    }

    public MainPageWithFindBy clickElementByChangeName() {
        inputFieldChangeName.click();
        return this;
    }

    public MainPageWithFindBy findElementByChangeLinkText() {
        inputFieldChangeLinkText.isDisplayed();
        return this;
    }

    public MainPageWithFindBy findCheckBox1() {
        checkBox1.isDisplayed();
        return this;
    }

    public MainPageWithFindBy findCheckBox2() {
        checkBox2.isDisplayed();
        return this;
    }

    public MainPageWithFindBy findCheckBox3() {
        checkBox3.isDisplayed();
        return this;
    }

    public MainPageWithFindBy clickSubmitButtonForCheckBox() {
        submitButton1.click();
        return this;
    }

    public MainPageWithFindBy findElementEnableToDisable() {
        InputFieldEnableTODisable.isDisplayed();
        return this;
    }

    public MainPageWithFindBy findCheckBoxEnableToDisable() {
        checkBoxEnableToDisable.isDisplayed();
        return this;
    }

}

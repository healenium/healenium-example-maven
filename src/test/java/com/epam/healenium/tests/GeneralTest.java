package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.selenide.pageobject.SelenideBasePage;
import com.epam.healenium.selenide.pageobject.markup.SelenideMarkupPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.epam.healenium.constants.PagesType.TEST_ENV;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneralTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Disable healing for Proxy approach")
    public void testConditionWait() {
        pages.get(TEST_ENV).openPage();
        driver.findElement(By.xpath("//*[@id='change:name']"));
        driver.findElement(By.id("Submit")).click();
        driver.findElement(By.xpath("//*[@id='change:name']"));
    }


//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Button click with FindBy annotation")
//    public void testButtonClickWithFindByAnnotationPage() {
//        FrameworkPage mainPage = pages.get(PagesType.MARKUP_FIND_BY);
//
//        mainPage.openPage().clickTestButton()
//                .confirmAlert()
//                .clickElementByChangeID(); // Click Element By Change ID
//        mainPage.clickSubmitButton()  //clicking Change locators button
//                .clickElementByChangeID();
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Input fields click with FindBy annotation")
//    public void testInputFiledsWithFindByAnnotationPage() {
//        FrameworkPage mainPage = pages.get(PagesType.MARKUP_FIND_BY);
//
//        mainPage.openPage().clickElementByChangeClassName()
//                .clickElementByChangeTagName()
//                .clickElementByChangeName()
//                .findElementByChangeLinkText();
//        mainPage.clickSubmitButton()
//                .clickElementByChangeClassName()
//                .clickElementByChangeTagName()
//                .clickElementByChangeName()
//                .findElementByChangeLinkText();
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Description("check box verify with FindBy annotation")
//    public void checkBoxWithFinByAnnotoationPage() {
//        FrameworkPage mainPage = pages.get(PagesType.MARKUP_FIND_BY);
//
//        mainPage.openPage().findCheckBox1()
//                .findCheckBox2()
//                .findCheckBox3();
//        mainPage.clickSubmitButtonForCheckBox()
//                .findCheckBox1()
//                .findCheckBox2()
//                .findCheckBox3();
//    }
//
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Input field enable to disable with FindBy annoatation ")
//    public void testInputFieldEnableToDisableWithFindByAnnotationPage() {
//        FrameworkPage mainPage = pages.get(PagesType.MARKUP_FIND_BY);
//
//        mainPage.openPage().findElementEnableToDisable();
//        mainPage.clickSubmitButton()
//                .findElementEnableToDisable();
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Description("check box checked  to unchecked with FindBy Annotation")
//    public void testCheckBoxCheckedToUncheckWithFindByAnnotationPage() {
//
//        FrameworkPage mainPage = pages.get(PagesType.MARKUP_FIND_BY);
//        mainPage.openPage().findCheckBoxEnableToDisable();
//        mainPage.clickSubmitButton()
//                .findCheckBoxEnableToDisable();
//    }

}

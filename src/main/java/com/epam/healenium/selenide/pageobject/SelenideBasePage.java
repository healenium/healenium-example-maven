package com.epam.healenium.selenide.pageobject;

import com.codeborne.selenide.Selenide;
import com.epam.healenium.FrameworkPage;

import static com.codeborne.selenide.Selenide.page;

public class SelenideBasePage extends FrameworkPage {

    public SelenideBasePage confirmAlert(){
        Selenide.switchTo().alert().accept();
        return page(SelenideBasePage.class);
    }

    public String getAlertText(){
        return Selenide.switchTo().alert().getText();
    }

    public void refreshPage(){
        Selenide.refresh();
    }
}

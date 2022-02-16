package com.epam.healenium.selenide.pageobject;

import com.codeborne.selenide.Selenide;
import com.epam.healenium.FrameworkPage;

public class SelenideBasePage extends FrameworkPage {

    public void confirmAlert(){
        Selenide.switchTo().alert().accept();
    }

    public String getAlertText(){
        return Selenide.switchTo().alert().getText();
    }

    public void refreshPage(){
        Selenide.refresh();
    }
}

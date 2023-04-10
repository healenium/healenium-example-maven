//package com.epam.healenium.tests;
//
//import com.epam.healenium.FrameworkPage;
//import com.epam.healenium.SelfHealingDriver;
//import com.epam.healenium.constants.PagesType;
//import io.qameta.allure.Description;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import net.thucydides.core.annotations.Managed;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class WaitTest  {
//
////    @Test
////    @Severity(SeverityLevel.NORMAL)
////    @Description("Conditional wait for simple locator")
////    public void testConditionWait(){
////        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.MARKUP));
////
////        mainPage.openPage()
////                .clickTestButton()
////                .confirmAlert();
////
////        mainPage.generateMarkup()
////                .clickTestButton() //should be healed
////                .confirmAlert();
////
////        mainPage.generateMarkup()
////                .clickTestButtonWaitor(5) //should be healed
////                .confirmAlert();
////    }
//
//
//    @Managed(driver = "chrome", options = "headless")
//    WebDriver driver;
//
//    @Test
//    public void testConditionWait() {
//        SelfHealingDriver selfHealingDriver = SelfHealingDriver.create(driver);
//        selfHealingDriver.get("google.com");
//        WebElement element = selfHealingDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
//        System.out.println(element.getText());
//    }
//
//}

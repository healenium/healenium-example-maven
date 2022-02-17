package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.PagesType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class WaitTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Conditional wait for simple locator")
    public void testConditionWait(){
        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.MARKUP));

        mainPage.openPage()
                .clickTestButton()
                .confirmAlert();

        mainPage.generateMarkup()
                .clickTestButton() //should be healed
                .confirmAlert();

        mainPage.generateMarkup()
                .clickTestButtonWaitor(5) //should be healed
                .confirmAlert();
    }

//    @Test
//    @Severity(SeverityLevel.TRIVIAL)
//    @Description("Conditional wait for alert. No healing necessary: has been added because user has problems")
//    public void testConditionWaitAlert(){
//        driver.get("C:\\Healenium\\Repository\\healenium-example-maven\\test_env\\index.html");
//
//        driver.findElement(By.id("submit_alert")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 11);
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//    }
}

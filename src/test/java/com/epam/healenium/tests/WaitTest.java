package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.SelfHealingDriverWait;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.epam.healenium.constants.PagesType.TEST_ENV;

public class WaitTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Conditional wait for simple locator")
    public void testConditionWait(){
        FrameworkPage page = pages.get(TEST_ENV).openPage();
        driver.findElement(By.id("Wait_Submit")).click();
        WebElement element = new SelfHealingDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("wait_new_element")));
        Assertions.assertEquals(element.getAttribute("placeholder"), "Wait input");
    }
}

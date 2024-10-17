package com.epam.healenium.tests;

import com.epam.healenium.SelfHealingDriver;
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

public class WaitTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Disable healing for Proxy approach")
    public void testConditionWait() {
        pages.get(TEST_ENV).openPage();
        if (!(driver instanceof SelfHealingDriver)) {
            driver.findElement(By.id("Wait_Submit")).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("disable_healing_true");
            WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.id("wait_new_element")));
            js.executeScript("disable_healing_false");
            Assertions.assertEquals("Wait input", element.getAttribute("placeholder"));
        }
    }
}

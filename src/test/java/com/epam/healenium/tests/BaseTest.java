package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.constants.BrowserType;
import com.epam.healenium.constants.DriverType;
import com.epam.healenium.constants.FrameworkType;
import com.epam.healenium.settings.DriverContext;
import com.epam.healenium.settings.FrameworkContext;
import com.epam.jdi.light.driver.WebDriverFactory;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.common.WindowsManager.closeWindow;


public class BaseTest {
    static protected WebDriver driver;
    static protected HashMap<String, FrameworkPage> pages;

    @BeforeAll
    static public void setUp() throws MalformedURLException {
        driver = new DriverContext(DriverType.LOCAL).getDriver(BrowserType.CHROME);

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1200, 800));

//        WebDriver delegate= WebDriverFactory.getDriver();
//        driver= SelfHealingDriver.create(delegate);
        pages = new FrameworkContext(FrameworkType.SELENIUM, driver).setFramework();
    }

    @AfterAll
    static public void afterAll() {
//        killAllSeleniumDrivers();
//        WebDriverFactory.quit();
        if (driver != null) {
            driver.quit();
        }
    }
}

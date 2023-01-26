package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.BrowserType;
import com.epam.healenium.constants.DriverType;
import com.epam.healenium.constants.FrameworkType;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.settings.DriverContext;
import com.epam.healenium.settings.FrameworkContext;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    static protected WebDriver driver;
    static protected HashMap<PagesType, FrameworkPage> pages;

    @BeforeAll
    static public void setUp() throws MalformedURLException {
        driver = new DriverContext(DriverType.LOCAL).getDriver(BrowserType.CHROME);

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1200, 800));

        pages = new FrameworkContext(FrameworkType.SELENIUM, driver).setFramework();
    }

    @AfterAll
    static public void afterAll() {
        if (driver != null) {
            driver.quit();
        }
    }

//    @Attachment(value = "Screenshot", type = "image/png")
//    public byte[] screenshot() {
//        return ((TakesScreenshot) driver.getDelegate()).getScreenshotAs(OutputType.BYTES);
//    }
}

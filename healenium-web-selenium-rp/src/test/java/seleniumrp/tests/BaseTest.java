package seleniumrp.tests;


import com.epam.healenium.SelfHealingDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.LoggingUtils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    static protected SelfHealingDriver driver;

    @BeforeAll
    static public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "90.0");
        capabilities.setCapability("enableVNC", true);

        RemoteWebDriver delegate = null;
        try {
            delegate = new RemoteWebDriver(
                URI.create("http://10.6.223.91:4444/wd/hub").toURL(),
                capabilities
            );
        } catch (MalformedURLException e) {
            e.getMessage();
        }

        driver = SelfHealingDriver.create(delegate);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1200, 800));
    }

    @AfterAll
    static public void afterAll() {
        if (driver != null) {
            driver.quit();
        }
    }

  public void screenshot() {
      File file = ((TakesScreenshot) driver.getDelegate()).getScreenshotAs(OutputType.FILE);
      LoggingUtils.log(file, "LAUNCH LOG MESSAGE WITH ATTACHMENT");
  }
}

package seleniumrp.tests;


import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import util.LoggingUtils;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    static protected SelfHealingDriver driver;

    @BeforeAll
    static public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        //declare delegate
        WebDriver delegate = new ChromeDriver(options);
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

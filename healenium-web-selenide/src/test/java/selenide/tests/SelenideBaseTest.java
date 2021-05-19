package selenide.tests;

import com.codeborne.selenide.WebDriverRunner;
import com.epam.healenium.SelfHealingDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class SelenideBaseTest {
  private static SelfHealingDriver driver;

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
    driver.manage().window().maximize();

    WebDriverRunner.setWebDriver(driver);
  }

  @AfterAll
  static public void afterAll() {
      WebDriverRunner.getWebDriver().quit();
  }
}

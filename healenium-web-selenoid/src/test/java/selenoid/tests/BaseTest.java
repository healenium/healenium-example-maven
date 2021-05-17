package selenoid.tests;

import com.epam.healenium.SelfHealingDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class BaseTest {
  static protected SelfHealingDriver driver;

  @BeforeAll
  static public void setUp() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "chrome");
    capabilities.setCapability("browserVersion", "90.0");
    capabilities.setCapability("enableVNC", true);

    RemoteWebDriver delegate = new RemoteWebDriver(
        URI.create("http://10.6.223.91:4444/wd/hub").toURL(),
        capabilities
    );

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

}

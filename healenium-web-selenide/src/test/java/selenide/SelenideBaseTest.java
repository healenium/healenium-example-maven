package selenide;

import com.codeborne.selenide.WebDriverRunner;
import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SelenideBaseTest {
  private static SelfHealingDriver driver;

  @BeforeAll
  static public void setUp() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.setHeadless(false);

    WebDriver delegate = new ChromeDriver(options);
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

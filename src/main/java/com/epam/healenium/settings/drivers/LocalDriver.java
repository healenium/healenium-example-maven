package com.epam.healenium.settings.drivers;

import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.settings.IDriverInterface;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class LocalDriver implements IDriverInterface {
    private SelfHealingDriver driver;

    @Override
    public WebDriver setDriver(Object delegate) {
        driver = SelfHealingDriver.create((WebDriver) delegate);

        return driver;
    }

    @Override
    public Object useChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        WebDriver delegate = new ChromeDriver(options);
        return delegate;
    }

    @Override
    public Object useFirefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
//        options.setHeadless(false);

        WebDriver delegate = new FirefoxDriver(options);
        return delegate;
    }

    @Override
    public Object useEdge() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();

        WebDriver delegate = new EdgeDriver(options);
        return delegate;
    }

    @Override
    public Object useSafari() {
        SafariOptions options = new SafariOptions();

        WebDriver delegate = new SafariDriver(options);
        return delegate;
    }
}

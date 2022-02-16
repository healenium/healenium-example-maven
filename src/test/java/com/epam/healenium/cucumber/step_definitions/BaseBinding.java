package com.epam.healenium.cucumber.step_definitions;

import com.epam.healenium.SelfHealingDriver;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseBinding {

    @Getter @Setter
    private WebDriver driver;

    @Given("init browser")
    public void initBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        //declare delegate
        WebDriver delegate = new ChromeDriver(options);
        driver = SelfHealingDriver.create(delegate);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1200, 800));
    }

    @Given("go to {String}")
    public void goToString(String siteLink) {
        driver.get(siteLink);
    }

    @Given("confirm alert")
    public void confirmAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}

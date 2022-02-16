package com.epam.healenium.cucumber.step_definitions;

import com.epam.healenium.SelfHealingDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEnvBindings {

    @Getter
    @Setter
    private SelfHealingDriver driver;

    @Given("fill field with CSS (.*) by value (.*)")
    @Then("fill field with CSS (.*) by value (.*) with Healing")
    public void inputValueByCss(String locator, String value){
        try{
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch (Exception e){
            assertTrue(driver.findElement(By.cssSelector(locator)).isDisplayed());
        }
    }

    @When("click button to change locators")
    public void clickChangeButton(){
        driver.findElement(By.id("Submit")).click();
    }

    @Given("fill field find by (.*) and locator (.*) by value (.*)")
    @Then("fill field find by (.*) and locator (.*) with Healing by value (.*)")
    public void inputValueSemantic(String semanticType, String locator, String value){

    }

    @Given("fill field with XPath (.*) by value (.*)")
    @Then("fill field with XPath (.*) with Healing by value (.*)")
    public void inputValueByXPath(String xpath, String value){
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }

//    @Given("click alert button")
//    @When("click alert button")
//    public void clickAlertButton(){
//
//    }

    @Given("wait (.*) second for alert")
    @Then("wait (.*) second for alert with Healing")
    public void waitAlert(int seconds){

    }
}

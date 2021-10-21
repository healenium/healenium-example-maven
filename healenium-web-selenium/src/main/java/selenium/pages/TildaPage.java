package selenium.pages;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import io.qameta.allure.Step;

public class TildaPage extends BasePage {
    By name = By.name("Name:first_name:second_name");
    By namePlaceholder = By.xpath("//*[@placeholder='Name']");
    By phone = By.name("Phone");

    By nameCss=By.cssSelector("[name='Name:first_name:second_name']");

    public TildaPage(SelfHealingDriver driver) {
        super(driver);
    }

    @Step("Open Main page")
    public TildaPage open() {
        driver.get(tildaUrl);
        return this;
    }

    @Step("Input Name")
    public void inputName(String nameInput) {
        driver.findElement(name).sendKeys(nameInput);
        driver.findElement(phone).click();
    }

    public boolean checkFillName(String someName) {
        return driver.findElement(namePlaceholder).isEnabled();
    }
}

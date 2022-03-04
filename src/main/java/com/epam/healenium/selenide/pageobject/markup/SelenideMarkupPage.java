package com.epam.healenium.selenide.pageobject.markup;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import com.epam.healenium.annotation.DisableHealing;
import com.epam.healenium.constants.PageUrl;
import com.epam.healenium.selenide.pageobject.SelenideBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelenideMarkupPage extends SelenideBasePage {

    private By generateMarkupBtnId = By.id("markup-generation-button");
    private By testButton = By.className("default-btn");
    private By testGeneratedButton = By.id("random-id");

    private By checkboxAccount = By.xpath("//*[@class='checkbox checkbox_size_m checkbox_theme_alfa-on-white']");
    private By textFirstSelect = By.xpath("(//*[text()='Select Account'])[1]");

    private By firstCheckboxChecked = By.xpath("//*[text()='Current account']//parent::label[contains(@class,'checked')]");
    private By checkboxChecked = By.xpath("//label[contains(@class,'checkbox_checked')]");
    private By checkboxUnchecked = By.xpath("//label[not(contains(@class,'checkbox_checked'))]");

    private By parentInput = By.xpath("//*[contains(@class,'input-group') and @role='group']");//span[@class='input__box']");
    private By childInput = By.xpath(".//*[@value='']");


    public SelenideMarkupPage openPage() {
        open(PageUrl.MARKUP_URL.toString());
        return page(SelenideMarkupPage.class);
    }

    public SelenideMarkupPage generateMarkup() {
        $(generateMarkupBtnId).click();
        return page(SelenideMarkupPage.class);
    }

    public SelenideMarkupPage clickTestButton() {
        $(testButton).click();
        return page(SelenideMarkupPage.class);
    }

    public SelenideMarkupPage clickTestGeneratedButton() {
        $(testGeneratedButton).click();
        return page(SelenideMarkupPage.class);
    }

    @DisableHealing
    public boolean displayedText() {
        try {
            return $(textFirstSelect).shouldBe(Condition.visible).isEnabled();
        } catch (ElementNotFound e1) {
            return false;
        }
    }

    public SelenideMarkupPage selectFirstCheckbox() {
        $$(checkboxAccount).get(0).click();
        return page(SelenideMarkupPage.class);
    }

    public boolean verifyFirstCheckbox() {
        return $$(checkboxAccount).get(0).isEnabled();
    }

    @DisableHealing
    public int verifyAllCheckboxesChecked() {
        List<SelenideElement> checkboxes = $$(checkboxChecked);
        checkboxes.forEach(c -> assertTrue(c.isEnabled()));
        return checkboxes.size();
    }

    @DisableHealing
    public int verifyAllCheckboxesUnchecked() {
        List<SelenideElement> checkboxes = $$(checkboxUnchecked);
        checkboxes.forEach(c -> assertTrue(c.isEnabled()));
        return checkboxes.size();
    }

    public int selectAllCheckboxes() {
        AtomicInteger count= new AtomicInteger();
        List<SelenideElement> checkboxes = $$(checkboxAccount);
        if (checkboxes.size() == 0)
            throw new NoSuchElementException("No checkboxes found");
        checkboxes.forEach(c -> {
            c.click();
            count.addAndGet(1);
        });
        return count.get();
    }

    public boolean verifyFirstAccountCheckbox() {
        return $(firstCheckboxChecked).isEnabled();
    }

    public SelenideMarkupPage selectFirstAccountCheckbox() {
        $(firstCheckboxChecked).click();
        return page(SelenideMarkupPage.class);
    }

    @DisableHealing
    public boolean testButtonEnable() {
        try {
            return $(testGeneratedButton).isEnabled();
        } catch (ElementNotFound e) {
            return false;
        }
    }

    @DisableHealing
    public boolean groupInputEnabled() {
        try {
            return $(parentInput).isEnabled()
                    && $(By.xpath("//*[@placeholder='Just some text']"))
                    .isEnabled();
        } catch (ElementNotFound e1) {
            return false;
        }
    }

    @DisableHealing
    public void fillInputsGroup() {
        SelenideElement parent = $(parentInput);
        List<SelenideElement> child = parent.$$(childInput);
        child.forEach(c -> c.sendKeys("Value"));
    }

    public void verifyInputText() {
        SelenideElement parent = $(parentInput);
        List<SelenideElement> child = parent.$$(childInput);
        if (child.size() == 0)
            throw new NoSuchElementException("No inputs found");
        child.forEach(c -> assertTrue(c.isEnabled()));
    }

    public SelenideMarkupPage clickTestButtonWaitor(int seconds) {
        $(testButton).shouldBe(visible, Duration.ofSeconds(seconds)).click();
        return page(SelenideMarkupPage.class);
    }
}

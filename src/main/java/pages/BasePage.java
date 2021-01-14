package pages;


import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected String mainPageUrl = "https://sha-test-app.herokuapp.com/";
    protected String ajaxLoadPageUrl = "https://stephanwagner.me/loading-spinner-with-animation";
    protected String yandexPageUrl = "https://yandex.ru/";
    protected SelfHealingDriver driver;

    public BasePage(SelfHealingDriver driver) {
        this.driver = driver;
    }

    public static void sleepForSecondsToSeeTheAlertWhileTestIsRunning(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getAlertText() {
        sleepForSecondsToSeeTheAlertWhileTestIsRunning(1);
        String foundAlertText = "";
        WebDriverWait wait = new WebDriverWait(driver, 0 /*timeout in seconds*/);
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            foundAlertText = driver.switchTo().alert().getText();
        } catch (TimeoutException eTO) {
            foundAlertText = "no alert text";
        }
        return foundAlertText;
    }

    public void confirmAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}

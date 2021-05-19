package selenoid.pages;


import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.Alert;

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

    public void confirmAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}

package Help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FrameMethods {

    public WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchtoFrameByid(String value) {
        waitFrame(value);
    }

    public void switchtoFrameByElement(WebElement element) {
        waitFrame(element);
    }

    public void waitFrame(String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(value));
    }

    public void waitFrame(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

    }

    public void switchToDefault() {
        driver.switchTo().defaultContent();


    }
}

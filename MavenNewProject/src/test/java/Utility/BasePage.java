package Utility;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static Utility.Hooks.driver;

public class BasePage {

//   WebDriver driver;
    protected void type(By by, String text) {
        if (text != null && !text.isEmpty()) {
            WebElement elm = driver.findElement(by);
            elm.sendKeys(Keys.HOME);
            elm.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            elm.sendKeys(text);
        }
    }
    protected void click(By by) {
        driver.findElement(by).click();
    }

    protected void waitUntilElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    protected void selectByValue(By by, String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        (new Select(driver.findElement(by))).selectByValue(value);
    }

    protected void waitUntilElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}

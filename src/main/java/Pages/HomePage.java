package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    By phoneNumberTextBox = By.id("phone-number");
    By createReqButton = By.xpath("//button[normalize-space(text())='Create Request']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterPhoneNumber(String phoneNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberTextBox));
        driver.findElement(phoneNumberTextBox).sendKeys(phoneNumber);
    }

    public void ClickCreateReqButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(createReqButton));
        driver.findElement(createReqButton).click();
    }
}

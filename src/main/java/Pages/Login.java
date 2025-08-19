package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    WebDriver driver;
    By emailTextBox = By.id("email");
    By passwordTextBox = By.id("password");
    By loginButton = By.xpath("//div[@class='form-actions']/button");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void UserLogin(String email,String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailTextBox));
        driver.findElement(emailTextBox).sendKeys(email);
        driver.findElement(passwordTextBox).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}


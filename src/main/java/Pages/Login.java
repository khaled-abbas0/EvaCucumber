package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    WebDriver driver;

    By UserNameTextBox = By.name("username");
    By PasswordTextBox = By.name("password");
    By LoginButton = By.xpath("//button[@type=\"submit\"]");

    public Login(WebDriver driver) {
        this.driver = driver;

    }
    public void UserLogin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameTextBox));
        driver.findElement(UserNameTextBox).sendKeys("Admin");
        driver.findElement(PasswordTextBox).sendKeys("admin123");
        driver.findElement(LoginButton).click();
    }
    public void UserLoginVerify() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).isDisplayed());

    }
}

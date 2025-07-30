package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddUserPage {
    WebDriver driver;
    By UserRoleDropDown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i");
    By AdminRoleOption =  By.xpath("//div[@role='option']//span[text()='Admin']");
    By EmployeeName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
    By EmployeeNameSuggestion = By.xpath("//div[@role='option']//span[contains(text(),'')]");
    By StatusDropDown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i");
    By EnabledStatus = By.xpath("//div[@role='option']//span[text()='Enabled']");
    By UserName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
    By Password = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    By ConfirmPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
    By SaveButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");

    public AddUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void AddNewUser(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(UserRoleDropDown));
        driver.findElement(UserRoleDropDown).click();
        driver.findElement(AdminRoleOption).click();
        driver.findElement(EmployeeName).sendKeys("a");
        wait.until(ExpectedConditions.elementToBeClickable(EmployeeNameSuggestion));
        driver.findElement(EmployeeNameSuggestion).click();
        driver.findElement(StatusDropDown).click();
        driver.findElement(EnabledStatus).click();
        driver.findElement(UserName).sendKeys("KhaledAbbas");
        driver.findElement(Password).sendKeys("khaledAbbas1");
        driver.findElement(ConfirmPassword).sendKeys("khaledAbbas1");
        driver.findElement(SaveButton).click();

    }
}
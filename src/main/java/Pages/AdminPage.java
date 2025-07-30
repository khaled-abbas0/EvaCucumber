package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage  {
    WebDriver driver;
    By AdminButton = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
    By NumberOfRecord = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span");
    By AddButton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By SystemUserNameSearch = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
    By SearchSaveButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
    By DeleteButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div/button[1]");
    By DeleteConfirmationButton = By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]");
    By ResetButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");

    public AdminPage(WebDriver driver) {
        this.driver = driver;

    }

    public void ClickAdminButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement adminButton = wait.until(ExpectedConditions.visibilityOfElementLocated(AdminButton));
        adminButton.click();

    }

    public int GetNumberOfRecord() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement recordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(NumberOfRecord));
        return Integer.parseInt(recordElement.getText().replaceAll("[^0-9]", ""));

    }

    public void ClickAddButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(AddButton));
        addBtn.click();
    }

    public void SearchByUserName(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(SystemUserNameSearch));
        driver.findElement(SystemUserNameSearch).sendKeys(username);
        driver.findElement(SearchSaveButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(DeleteButton));
        WebElement element = driver.findElement(DeleteButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(DeleteButton).click();
        driver.findElement(DeleteConfirmationButton).click();
        WebElement resetBtn = wait.until(ExpectedConditions.presenceOfElementLocated(ResetButton));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(resetBtn)).click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", resetBtn);
        }









    }

}



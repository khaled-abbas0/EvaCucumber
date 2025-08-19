package stepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import Pages.Login;

public class LoginSteps {
    WebDriver driver = DriverManager.getDriver();
    Login loginObj;

    @Given("I am logged in as a doctor with email {string} and password {string}")
    public void iAmLoggedInAsADoctorWithEmailAndPassword(String Email, String Password) {
        driver.get("https://limitlesscaredoctorportal-staging.azurewebsites.net/auth/login");
        loginObj = new Login(driver);
        loginObj.UserLogin(Email,Password);
    }
}

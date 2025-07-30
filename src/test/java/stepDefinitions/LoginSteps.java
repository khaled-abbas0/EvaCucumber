package stepDefinitions;

import Pages.Login;
import Utilities.DriverManager;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
public class LoginSteps {

    WebDriver driver = DriverManager.getDriver();
    Login loginObj;

    @Given("I login as an Admin with username and password")
    public void iLoginAsAnAdminWithUsernameAndPassword() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginObj = new Login(driver);
        loginObj.UserLogin();
    }


    @Then("verify that user is logged")
    public void verifyThatUserIsLogged() throws InterruptedException {
        loginObj = new Login(driver);
        loginObj.UserLoginVerify();

    }



}

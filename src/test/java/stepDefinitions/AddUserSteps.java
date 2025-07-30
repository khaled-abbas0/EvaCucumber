package stepDefinitions;

import Pages.AddUserPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class AddUserSteps {
    WebDriver driver = DriverManager.getDriver();
    AddUserPage AddUserObj;

    @And("I add a new admin user")
    public void iAddANewAdminUser() {
        AddUserObj = new AddUserPage(driver);
        AddUserObj.AddNewUser();
    }
}


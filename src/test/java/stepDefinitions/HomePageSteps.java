package stepDefinitions;

import Pages.HomePage;
import Utilities.DriverManager;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    WebDriver driver = DriverManager.getDriver();
    HomePage homePageObj;

    @When("I enter patient phone number {string}")
    public void iEnterPatientPhoneNumber(String phoneNumber) {
        homePageObj = new HomePage(driver);
        homePageObj.EnterPhoneNumber(phoneNumber);
    }
}

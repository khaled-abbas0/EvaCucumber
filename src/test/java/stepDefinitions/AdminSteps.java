package stepDefinitions;

import Pages.AddUserPage;
import Pages.AdminPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AdminSteps {

    WebDriver driver = DriverManager.getDriver();  
    AdminPage AdminPageObj;

    @When("I navigate to the Admin page")
    public void iNavigateToTheAdminPage() {
        AdminPageObj = new AdminPage(driver);
        AdminPageObj.ClickAdminButton();
    }


    @When ("I get the current number of admin records")
    public void iGetTheCurrentNumberOfAdminRecords() {
        AdminPageObj = new AdminPage(driver);
        AdminPageObj.GetNumberOfRecord();
    }

    @And("I press add button")
    public void iAddANewAdminUser() {
        AdminPageObj = new AdminPage(driver);
        AdminPageObj.ClickAddButton();
    }

    @Then("the number of records should increase by 1")
    public void theNumberOfRecordsShouldIncreaseBy(){
        AdminPageObj = new AdminPage(driver);
        int NumberOfRecord = AdminPageObj.GetNumberOfRecord();
        Assert.assertEquals(NumberOfRecord,NumberOfRecord+1);

    }




   @When("I search for the admin user and delete the new user")
   public void iSearchForTheAdminUser() {
     AdminPageObj = new AdminPage(driver);
     AdminPageObj.SearchByUserName("KhaledAbbas");



   }

    @Then("the number of records should decrease by 1")
    public void theNumberOfRecordsShouldDecreaseBy() {
        AdminPageObj = new AdminPage(driver);
        int NumberOfRecord = AdminPageObj.GetNumberOfRecord();
        Assert.assertEquals(NumberOfRecord,NumberOfRecord-1);
    }
}


package stepDefinitions;

import Pages.CreateRX;
import Pages.HomePage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class createRxSteps {
    WebDriver driver = DriverManager.getDriver();
    HomePage homePageObj;
    CreateRX createRXObj;

    @Then("the system should navigate to Create RX page")
    public void theSystemShouldNavigateToPage() {
        homePageObj = new HomePage(driver);
        homePageObj.ClickCreateReqButton();
    }

    @When("I add patient vitals {string}, {string}, {string},{string},{string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void iAddPatientVitals(String weight,String HBA1C,String bloodPressure,String bloodPressure2,String heartRate,String temperature,String respiratoryRate,String oxygenSaturation,String height,String randomBloodGlucose,String isSmoker,String isAlcoholic)
    {
        createRXObj = new CreateRX(driver);
        createRXObj.AddPatientVitals(weight,HBA1C,bloodPressure,bloodPressure2,heartRate,temperature,respiratoryRate,oxygenSaturation,height,randomBloodGlucose,isSmoker,isAlcoholic);

    }

    @And("I add patient needed diagnosis {string}")
    public void iAddPatientNeededDiagnosis(String diagnosis) {
        createRXObj = new CreateRX(driver);
        createRXObj.AddPatientNeededDiagnosis(diagnosis);
    }

    @And("I add patient medications {string}")
    public void iAddPatientMedications(String medications) {
        createRXObj = new CreateRX(driver);
        createRXObj.AddPatientMedications(medications);
    }

    @And("I add patient needed lab tests {string}")
    public void iAddPatientNeededLabTests(String labTests) {
        createRXObj = new CreateRX(driver);
        createRXObj.AddPatientNeededLabTests(labTests);
    }

    @And("I add patient needed radiology {string}")
    public void iAddPatientNeededRadiology(String radiology) {
        createRXObj = new CreateRX(driver);
        createRXObj.AddPatientNeededRadiology(radiology);
    }


    @And("I add patient needed physiotherapy {string}")
    public void iAddPatientNeededPhysiotherapy(String physiotherapy) {
        createRXObj = new CreateRX(driver);
        createRXObj.AddPatientNeededPhysiotherapy(physiotherapy);
    }

    @And("I upload case images {string}")
    public void iUploadCaseImages(String image) {
        createRXObj = new CreateRX(driver);
        createRXObj.AddPatientNeededCaseImage(image);
    }

    @And("I add general notes {string}")
    public void iAddGeneralNotes(String notes) {
        createRXObj = new CreateRX(driver);
        createRXObj.AddPatientNeededNotes(notes);

    }

    @And("I click on Create E-prescription")
    public void iClickOnCreateEPrescription(){
        createRXObj = new CreateRX(driver);
        createRXObj.ClickOnCreatePrescription();
    }

    @Then("I should see a success message {string}")
    public void iShouldSeeASuccessMessage(String successMessage) {
        createRXObj.AssertOnSuccessMessage(successMessage);
    }
}


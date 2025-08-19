package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CreateRX {
    WebDriver driver;
    By patientVitals = By.xpath("(//a[text()='Patient Vitals'])[2]");
    By weightTextBox = By.xpath("(//label[text()='Weight ']/..//input)[1]");
    By HBA1CTextBox  = By.xpath("(//label[text()='HBA1C ']/..//input)[1]");
    By firstNumBloodPressureTextBox = By.xpath("(//label[text()='Blood Pressure']/..//input)[1]");
    By secondNumBloodPressureTextBox = By.xpath("(//label[text()='Blood Pressure']/..//input)[2]");
    By heartRateTextBox = By.xpath("//label[text()='Heart Rate']/..//input");
    By temperatureTextBox  = By.xpath("(//label[text()='Temperature']/..//input)[1]");
    By respiratoryRateTextBox = By.xpath("//label[text()='Respiratory Rate']/..//input");
    By oxygenSaturationTextBox = By.xpath("(//label[text()='Oxygen Saturation']/..//input)[1]");
    By heightTextBox = By.xpath("(//label[text()='Height']/..//input)[1]");
    By randomBloodGlucoseTextBox = By.xpath("(//label[text()='Random Blood Glucose']/..//input)[1]");
    By diagnosisButton = By.xpath("(//a[text()='Diagnosis'])[2]");
    By diagnosisTextBox = By.xpath("//input[@placeholder='Search for Diagnosis']");
    By medicationsButton = By.xpath("(//a[text()='Medications'])[2]");
    By medicationsTextBox = By.xpath("//input[@placeholder='Search for Medications']");
    By medicineDirection = By.xpath ("//*[@id=\"pn_id_8\"]/div");
    By medicineDirectionDropDown = By.xpath("//*[@id=\"pn_id_8_1\"]/span");
    By labTestsButton = By.xpath("(//a[text()='Lab Tests'])[2]");
    By labTestsTextBox = By.xpath("//input[@placeholder='Search for Lab Tests']");
    By radiology = By.xpath("(//a[text()='Radiology'])[2]");
    By radiologyTextBox = By.xpath("//input[@placeholder='Search for Radiology']");
    By physiotherapyButton = By.xpath("(//a[text()='Physiotherapy'])[2]");
    By physiotherapyTextBox = By.xpath("//input[@placeholder='Search for Physiotherapy']");
    By uploadCaseImageButton = By.xpath("(//a[text()='Upload Case Image'])[2]");
    By clickOnUploadImageButton = By.xpath("//a[text()='Upload Image']");
    By fromDeviceButton = By.xpath("//span[text()='From Device']/..");
    By submitButton = By.xpath("//button[normalize-space()='Submit']");
    By anatomyTextBox = By.xpath("//div[text()=' Select ']");
    By anatomyCheckBox = By.xpath("//*[@id=\"UploadCaseImage\"]/app-upload-case/div[3]/div/div[1]/div[1]/div");
    By anatomySubmitButton = By.xpath("//button[text()=' Submit ']");
    By notesButton = By.xpath("(//a[text()='General Notes'])[2]");
    By notesTextBox = By.xpath("//textarea[@placeholder='Ex: The patient needs regular CBC each 3 months']");
    By prescriptionButton = By.xpath("//button[text()=' Create ']");
    By successMessage = By.xpath("(//div[@class='alert-text']/.. //span)[3]");

    public CreateRX (WebDriver driver){
        this.driver = driver;
    }

    public void AddPatientVitals(String weight,String HBA1C,String bloodPressure,String bloodPressure2,String heartRate,String temperature,String respiratoryRate,String oxygenSaturation,String height,String randomBloodGlucose,String isSmoker,String isAlcoholic)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(patientVitals));
        driver.findElement(patientVitals).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(weightTextBox));
        driver.findElement(weightTextBox).sendKeys(weight);
        driver.findElement(HBA1CTextBox).sendKeys(HBA1C);
        driver.findElement(firstNumBloodPressureTextBox).sendKeys(bloodPressure);
        driver.findElement(secondNumBloodPressureTextBox).sendKeys(bloodPressure2);
        driver.findElement(heartRateTextBox).sendKeys(heartRate);
        driver.findElement(temperatureTextBox).sendKeys(temperature);
        driver.findElement(respiratoryRateTextBox).sendKeys(respiratoryRate);
        driver.findElement(oxygenSaturationTextBox).sendKeys(oxygenSaturation);
        driver.findElement(heightTextBox).sendKeys(height);
        driver.findElement(randomBloodGlucoseTextBox).sendKeys(randomBloodGlucose);
        By isSmokerBtn = By.xpath("//label[text()='Is Smoker']/..//button[normalize-space()='"+isSmoker+"']");
        driver.findElement(isSmokerBtn).click();
        By isAlcoholicBtn = By.xpath("//label[text()='Is Alcoholic']/..//button[normalize-space()='"+isAlcoholic+"']");
        driver.findElement(isAlcoholicBtn).click();
    }

    public void AddPatientNeededDiagnosis(String diagnosis){
        By ClickOnDiagnosis = By.xpath("//span[contains(text(), '"+diagnosis+"')]");
        driver.findElement(diagnosisButton).click();
        driver.findElement(diagnosisTextBox).sendKeys(diagnosis);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnDiagnosis));
        driver.findElement(ClickOnDiagnosis).click();
    }

    public void AddPatientMedications(String medications){
        driver.findElement(medicationsButton).click();
        driver.findElement(medicationsTextBox).sendKeys(medications);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By ClickOnMedications = By.xpath("//div[contains(text(), '"+medications+"')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnMedications));
        driver.findElement(ClickOnMedications).click();
        driver.findElement(medicineDirection).click();
        driver.findElement(medicineDirectionDropDown).click();
    }

    public void AddPatientNeededLabTests(String labTests){
        driver.findElement(labTestsButton).click();
        driver.findElement(labTestsTextBox).sendKeys(labTests);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By ClickOnLabTests = By.xpath("//span[contains(text(), '"+labTests+"')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnLabTests));
        driver.findElement(ClickOnLabTests).click();
    }

    public void AddPatientNeededRadiology(String radiology){
        driver.findElement(this.radiology).click();
        driver.findElement(radiologyTextBox).sendKeys(radiology);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By ClickOnRadiology = By.xpath("//span[contains(text(), '"+radiology+"')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnRadiology));
        driver.findElement(ClickOnRadiology).click();
    }

    public void AddPatientNeededPhysiotherapy(String physiotherapy){
        driver.findElement(physiotherapyButton).click();
        driver.findElement(physiotherapyTextBox).sendKeys(physiotherapy);
        By ClickOnPhysiotherapy = By.xpath("//span[contains(text(), '"+physiotherapy+"')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnPhysiotherapy));
        driver.findElement(ClickOnPhysiotherapy).click();
    }

    public void AddPatientNeededCaseImage(String image){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadCaseImageButton));
        driver.findElement(uploadCaseImageButton).click();
        driver.findElement(clickOnUploadImageButton).click();
        driver.findElement(fromDeviceButton).click();
        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
        String imagePath = System.getProperty("user.dir") + "/src/test/resources/images/" + image;
        fileInput.sendKeys(imagePath);
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(submitButton).click();
        driver.findElement(anatomyTextBox).click();
        driver.findElement(anatomyCheckBox).click();
        wait.until(ExpectedConditions.elementToBeClickable(anatomySubmitButton)).click();
    }

    public void AddPatientNeededNotes(String notes){
        driver.findElement(notesButton).click();
        driver.findElement(notesTextBox).sendKeys(notes);
    }

    public void ClickOnCreatePrescription() {
        WebElement createButtonElement = driver.findElement(prescriptionButton);
        WebElement rightScroll = driver.findElement(By.id("sideSummaryContainer"));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollTop = arguments[1].offsetTop;",
                rightScroll, createButtonElement
        );
        createButtonElement.click();
    }

    public void AssertOnSuccessMessage(String successMessage){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.successMessage));
        Assert.assertEquals(driver.findElement(this.successMessage).getText(), successMessage);
    }
}

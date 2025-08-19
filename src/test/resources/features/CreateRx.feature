Feature: Eva Pharma Assessment Test

  Scenario Outline: Create a simple prescription successfully
    Given I am logged in as a doctor with email "<email>" and password "<password>"
    When I enter patient phone number "<phoneNumber>"
    Then the system should navigate to Create RX page
    When I add patient vitals "<weight>", "<HBA1C>", "<bloodPressure>","<bloodPressure2>","<heartRate>", "<temperature>", "<respiratoryRate>", "<oxygenSaturation>", "<height>", "<randomBloodGlucose>", "<isSmoker>", "<isAlcoholic>"
    And I add patient needed diagnosis "<diagnosis>"
    And I add patient medications "<medications>"
    And I add patient needed lab tests "<labTests>"
    And I add patient needed radiology "<radiology>"
    And I add patient needed physiotherapy "<physiotherapy>"
    And I upload case images "<images>"
    And I add general notes "<notes>"
    And I click on Create E-prescription
    Then I should see a success message "<successMessage>"

    Examples:
      | email                          | password | phoneNumber | weight | HBA1C | bloodPressure | bloodPressure2 | heartRate | temperature | respiratoryRate | oxygenSaturation | height | randomBloodGlucose | isSmoker | isAlcoholic | diagnosis                  | medications             | labTests   | radiology | physiotherapy      | images                            | notes                 | successMessage                                          |
      | khaled.hackathon@evapharma.com | 123456   | 01143350367 | 70     | 6     | 120           | 80             | 75 bpm    | 36.8 C      | 18/min          | 98%              | 170 cm | 110 mg/dL          | No       | No          | Neonatal diabetes mellitus | METFORMIN 500MG 200 TAB | HBc, total | CT chest  | Shock Wave Therapy | image1.jpg | Take meds after meals | The electronic prescription has been added successfully |
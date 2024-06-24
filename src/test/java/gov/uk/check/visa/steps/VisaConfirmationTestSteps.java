package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationTestSteps {

    @Given("I am on check uk visa page")
    public void iAmOnCheckUkVisaPage() {
    }

    //Click on start button
    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartsNow();
    }

    //Select a Nationality 'Australia' ,Select a Nationality 'Chile', Select a Nationality 'Dominica'
    @And("I select a Nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    //Click on Continue button
    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickContinueButton();
    }

    //Select reason 'Tourism', Select reason 'Work, academic visit or business' , Select reason 'Join partner or family for a long stay'
    @And("I select reason {string}")
    public void iSelectReason(String reasonOption) {
        new ReasonForTravelPage().selectReasonForVisit(reasonOption);
    }

    // verify result 'You will not need a visa to come to the UK', verify result 'You need a visa to work in health and care',verify result 'You’ll need a visa to join your family or partner in the UK'
    @Then("Verify result message {string}")
    public void verifyResultMessage(String resultMessage) {
        new ResultPage().confirmResultMessage(resultMessage);
    }

    //Select intendent to stay for 'longer than 6 months'
    @And("I select intendent to stay for {string}")
    public void iSelectIntendentToStayForLongerThanMonths(String duration) {
        new DurationOfStayPage().selectLengthOfStay(duration);
    }

    //Select have planning to work for 'Health and care professional'
    @And("I select have planning to work for {string}")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional(String workType) {
        new WorkType().selectJobType(workType);
    }

    //Select state My partner of family member have uk immigration status 'yes'
    @And("I select state My partner of family member have uk immigration status {string}")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String status) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }


}

package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class);

    /*//continueButton
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;*/

    //immigration status 'Yes' option
    @CacheLookup
    @FindBy(xpath = "//input[@name='response' and @value='yes']")
    WebElement yesStatus;

    //immigration status 'No' option
    @CacheLookup
    @FindBy(xpath = "//input[@name='response' and @value='no']")
    WebElement noStatus;

    //This method will select immigration status option
    //(Note: Use switch statement for select immigration status)
    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "Yes":
                clickOnElement(yesStatus);
                break;
            case "No":
                clickOnElement(noStatus);
                break;
            default:
                System.out.println("not select any immigration status");
        }
        log.info("Select" + status + " option from immigration status field" );
    }

    /*public void clickContinueButton() {
        clickOnElement(continueButton);
        log.info("Click on Continue button" + continueButton.toString());

    }*/
}

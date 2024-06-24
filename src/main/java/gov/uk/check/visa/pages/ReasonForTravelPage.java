package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class);

    /*//continue button
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;*/

    //Reason For Visit radio options
    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']//label")
    List<WebElement> reasonForVisitList;

    //this method will select reasons from reason from visit field
    public void selectReasonForVisit(String reason) {
        //List<WebElement> reasonForVisitOptions = reasonForVisitList;
        for (WebElement option : reasonForVisitList) {
            if (option.getText().equals(reason)) {
                option.click();
                break;
            }
        }
        log.info("Select " + reason + " from What are you coming to the UK to do? radio options field");
    }

  /*  public void clickContinueButton() {
        clickOnElement(continueButton);
        log.info("Click on Continue button");
    }*/
}

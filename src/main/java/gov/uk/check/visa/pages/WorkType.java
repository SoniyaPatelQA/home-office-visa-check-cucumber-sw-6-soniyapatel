package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkType extends Utility {
    private static final Logger log = LogManager.getLogger(WorkType.class);

   /* //continueButton
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;*/

    //Job Type List
    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']//label")
    List<WebElement> selectJobtypeList;

    //this method will select job type
    public void selectJobType(String job) {
        List<WebElement> jobTypeOptions = selectJobtypeList;
        for (WebElement option : jobTypeOptions) {
            if (option.getText().equalsIgnoreCase(job)) {
                option.click();
            }
            break;
        }
        log.info("Select " + job + " type from planning to work in any job types radio options field");

    }

   /* public void clickContinueButton() {
        clickOnElement(continueButton);
       log.info("Click on Continue button" + continueButton.toString());

    }*/
}

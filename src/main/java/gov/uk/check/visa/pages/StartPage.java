package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class);

    //startNow button
    @CacheLookup
    @FindBy(className = "govuk-button--start")
    WebElement startNowButton;

    public void clickStartsNow() {
        clickOnElement(startNowButton);
        log.info("click on StartNow button");
    }

}

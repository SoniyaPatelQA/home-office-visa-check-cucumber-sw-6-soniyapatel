package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class);

    /*//continue button
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;*/

    //Duration of stay - less Than Six Month option
    @CacheLookup
    @FindBy(xpath = "//input[@value='six_months_or_less']")
    WebElement lessThanSixMonths;

    //Duration of stay - More Than Six Month option
    @CacheLookup
    @FindBy(xpath = "//input[@value='longer_than_six_months']")
    WebElement moreThanSixMonths;


    // This method will select duration  from duration of stay field
    // (Note: use switch statement for select moreOrLess stay)
    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                break;
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
                break;
            default:
                System.out.println("not select any stay time");
        }
        log.info("Select" + moreOrLess + " option from duration of stay field");

    }
/*
    //click on continue button
    public void clickContinueButton() {
        clickOnElement(continueButton);
        log.info("Click on Continue button" + continueButton.toString());

    }*/
}

package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class);

    //resultMessageText
    @CacheLookup
    @FindBy(xpath = "//div[@data-flow-name='check-uk-visa']/div/h2")
    WebElement resultMessage;

    //get text from result message
    public String getResultMessage() {
        log.info("Get visa check outcome message"+ resultMessage.getText());
        return getTextFromElement(resultMessage);
    }

    //this method will confirm result message
    public void confirmResultMessage(String expectedMessage) {
        Assert.assertEquals(getResultMessage(), expectedMessage, "expected message is not displayed");
        log.info("Verify result message");
    }
}

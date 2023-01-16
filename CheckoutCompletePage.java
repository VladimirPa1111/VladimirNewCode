package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage {
    public CheckoutCompletePage (WebDriver driver){
        super(driver);
    }
By completeHeaderBy = By.className("complete-header");

    public CheckoutCompletePage verifySuccessfulPurchase (String expectedText){
    String actualText = readText(completeHeaderBy);
    assertTextEquals(expectedText, actualText);
    return this;
}
    
}

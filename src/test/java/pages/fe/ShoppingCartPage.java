package pages.fe;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.actions.ElementActions;

public class ShoppingCartPage extends ElementActions {

    String currentURL;
    By checkOutBTN=By.xpath("//button[text()=' Continue to checkout ']");
    public void goToTestLink(){
        currentURL=getDriver().getCurrentUrl();
        getDriver().navigate().to(getEnvironmentTestURL()+currentURL.substring(26));
    }

    public void clickOnCheckout(){
        forceClickOnElement(getElement(checkOutBTN));
    }

}

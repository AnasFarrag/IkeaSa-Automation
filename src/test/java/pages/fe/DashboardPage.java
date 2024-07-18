package pages.fe;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.actions.ElementActions;


public class DashboardPage extends ElementActions {


    By addToCartBTN = By.xpath("//button[contains(@class,'pip-btn pip-btn--small pip-btn--icon-emphasised pip-product-compact__add-to-cart-button')]");
    By acceptCookiesBTN = By.xpath("//button[text()='Accept All Cookies']");
    By shoppingCartBTN = By.xpath("//span[text()='Shopping bag']");
    By confirmationDisclaimer = By.xpath("//span[contains(text(),'was added to your shopping cart')]");
    By newLowerPriceLBL = By.xpath("//h2[text()='New lower price']");


    public void goToHomePage() {
        getDriver().navigate().to(getEnvironmentURL());
    }

    public void acceptDisclaimer() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(acceptCookiesBTN));
            forceClickOnElement(getElement(acceptCookiesBTN));
        } catch (Exception e) {
            e.printStackTrace(System.out);

        }
    }

    public void addProductToCart() {
        scrollPageToElement(getElement(newLowerPriceLBL));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartBTN));
        forceClickOnElement(getElementByIndex(addToCartBTN, 1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationDisclaimer));
    }

    public void goToShoppingCart() {
        forceClickOnElement(getElement(shoppingCartBTN));
    }
}
package pages.fe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.TestBase;
import utilities.actions.BrowserActions;
import utilities.actions.ElementActions;


public class DashboardPage extends ElementActions {


    By addToCartBTN = By.xpath("//button[contains(@class,'pip-btn pip-btn--small pip-btn--icon-emphasised pip-product-compact__add-to-cart-button')]");
    By acceptCookiesBTN = By.xpath("//button[text()='Accept All Cookies']");

    By shoppingCartBTN = By.xpath("//span[text()='Shopping bag']");
    By confirmationDisclaimer = By.xpath("//span[contains(text(),'was added to your shopping cart')]");
    By newLowerPriceLBL = By.xpath("//h2[text()='New lower price']");
    String productName;


    public void goToHomePage() {
        getDriver().navigate().to(getEnvironmentURL());
    }

    public void acceptDisclaimer() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(acceptCookiesBTN));
            forceClickOnElement(getElement(acceptCookiesBTN));
        } catch (Exception e) {

        }
    }

    public void addProductToCart() {
        scrollPageToElement(getElement(newLowerPriceLBL));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartBTN));
        //setProductName(getElementByIndex(addToCartBTN,1).getAttribute("aria-label").toString());
        forceClickOnElement(getElementByIndex(addToCartBTN, 1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationDisclaimer));
    }

    public void goToShoppingCart() {
        forceClickOnElement(getElement(shoppingCartBTN));
    }

    public void setProductName(String name) {
        productName = name;

    }

    public String getProductName() {
        return productName;
    }


}
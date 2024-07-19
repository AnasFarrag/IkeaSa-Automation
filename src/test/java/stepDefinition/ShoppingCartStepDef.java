package stepDefinition;

import io.cucumber.java.en.And;
import pages.fe.ShoppingCartPage;

public class ShoppingCartStepDef extends ShoppingCartPage {


    @And("user click on continue to checkout")
    public void userClickOnContinueToCheckout() {
        clickOnCheckout();
        goToTestLink();

    }
}

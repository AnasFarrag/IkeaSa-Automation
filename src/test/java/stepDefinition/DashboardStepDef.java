package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import pages.fe.DashboardPage;

public class DashboardStepDef extends DashboardPage {


    @Given("user open Ikea Portal")
    public void user_open_ikea_portal() {
        goToHomePage();
        acceptDisclaimer();
    }

    @When("user add product to bag")
    public void user_add_product_to_bag() {
        addProductToCart();
    }

    @And("user go to the bag")
    public void user_go_to_the_bag(){
        goToShoppingCart();
    }
}

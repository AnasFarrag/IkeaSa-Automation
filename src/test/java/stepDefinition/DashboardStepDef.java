package stepDefinition;

import io.cucumber.java.en.Given;
import pages.fe.DashboardPage;

public class DashboardStepDef extends DashboardPage{


//    @Given("user open Ikea Portal")
//    public void userOpenIkeaPortal() {
//        goToHomePage();
//    }
    @Given("user open Ikea Portal")
    public void user_open_ikea_portal() {
        goToHomePage();
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
}

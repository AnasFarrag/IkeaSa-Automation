package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.fe.DeliveryPage;

public class DeliveryStepDef extends DeliveryPage {


    @And("User fill his personal data for delivery")
    public void userFillHisPersonalDataForDelivery() {
        fillData();
    }

    @And("user click next button for delivery")
    public void userClickNextButton() {
        clickNext();
    }

    @And("user click next button to go checkout")
    public void userClickNextButtonToGoCheckout() {
        clickNextToCheckout();
    }

    @And("user choose pay by credit debit card")
    public void userChoosePayByCreditDebitCard() {
        clickOnCreditDebitCard();
    }

    @And("user fills his card")
    public void userFillsHisCard() {
        fillTheCreditCardData();
    }

    @And("user click pay now")
    public void userClickPayNow() {
        clickOnPayNowButton();
    }

    @Then("user should see a success Icon")
    public void userShouldSeeASuccessIcon() {
        assertSuccessIcon();
    }

    @And("user should see a confirmation Number")
    public void userShouldSeeAConfirmationNumber() {
        assertConfirmationNumberExists();
    }
}

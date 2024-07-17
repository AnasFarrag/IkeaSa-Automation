package stepDefinition;

import io.cucumber.java.en.And;
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
}

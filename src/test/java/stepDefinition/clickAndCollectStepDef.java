package stepDefinition;

import io.cucumber.java.en.And;
import pages.fe.clickAndCollectPage;

public class clickAndCollectStepDef extends clickAndCollectPage {
    @And("user choose Click & Collect")
    public void userChooseClickCollect() {
        clickOnClickAndCollect();
    }

    @And("User fill his personal data for click and collect")
    public void userFillHisPersonalDataForClickAndCollect() {
        fillData();
    }

    @And("user click next button for click and collect")
    public void userClickNextButtonForClickAndCollect() {
        clickNext();
    }
}

package pages.fe;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Paths;
import utilities.actions.ElementActions;
import utilities.readers.JsonTestDataReader;

public class clickAndCollectPage extends ElementActions {
    JSONObject clickAndCollectInfoData = (JSONObject) JsonTestDataReader.parseJson(Paths.clickAndCollectInfoPath).get("ClickAndCollectInfo");

//    ---------------------------------Locators------------------------------------------
    By clickAndCollectTab = By.id("pickup");
    By cityDropDown = By.id("mat-input-14");
    By abhaOpt=By.xpath("//span[text()=' Abha ']");
    By collectionPointDropDown = By.id("mat-input-15");
    By collectionPointOpt = By.xpath("//div[@class = 'collection-title ng-star-inserted']");
    By firstNameTxtBx = By.id("mat-input-16");
    By lastNameTxtBx = By.id("mat-input-17");
    By emailTxtBx = By.id("mat-input-18");
    By mobileNumberTxtBx = By.id("mat-input-19");
    By nextBTN=By.xpath("//button[contains(@class,'mat-focus-indicator btn-rounded mat-raised-button mat-button-base mat-primary')]");
    By loadingSpinner = By.xpath("//ngb-modal-window[contains(@role,'dialog')]");

//    --------------------------------------------------------------------------------------------------------
    public void clickOnClickAndCollect() {
        forceClickOnElement(getElement(clickAndCollectTab));
    }


    public void fillData() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingSpinner));
        getElement(cityDropDown).sendKeys(clickAndCollectInfoData.get("city").toString());
        forceClickOnElement(getElement(abhaOpt));
        getElement(collectionPointDropDown).sendKeys(clickAndCollectInfoData.get("collectionPoint").toString());
        forceClickOnElement(getElement(collectionPointOpt));
        getElement(firstNameTxtBx).sendKeys(clickAndCollectInfoData.get("firstName").toString());
        getElement(lastNameTxtBx).sendKeys(clickAndCollectInfoData.get("lastName").toString());
        getElement(emailTxtBx).sendKeys(clickAndCollectInfoData.get("email").toString());
        getElement(mobileNumberTxtBx).sendKeys(clickAndCollectInfoData.get("mobileNumber").toString());
    }
    public void clickNext(){
        forceClickOnElement(getElement(nextBTN));
    }
}

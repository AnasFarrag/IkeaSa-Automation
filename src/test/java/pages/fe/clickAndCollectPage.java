package pages.fe;

import org.openqa.selenium.By;
import utilities.actions.ElementActions;

public class clickAndCollectPage extends ElementActions {

    By clickAndCollectTab = By.id("pickup");
    By collectionPointDropDown = By.id("mat-input-15");
    By collectionPointOpt = By.xpath("//b[text()='IKEA Order & Collection Point - Al-Qassim']");
    By firstNameTxtBx = By.id("mat-input-16");
    By lastNameTxtBx = By.id("mat-input-17");
    By emailTxtBx = By.id("mat-input-18");
    By mobileNumberTxtBx = By.id("mat-input-19");
    By nextBTN=By.xpath("//button[contains(@class,'mat-focus-indicator btn-rounded mat-raised-button mat-button-base mat-primary')]");

    public void clickOnClickAndCollect() {
        forceClickOnElement(getElement(clickAndCollectTab));
    }

    public void fillData() {
        getElement(collectionPointDropDown).sendKeys("IKEA");
        forceClickOnElement(getElement(collectionPointOpt));
        getElement(firstNameTxtBx).sendKeys("Test");
        getElement(lastNameTxtBx).sendKeys("Test");
        getElement(emailTxtBx).sendKeys("test@test.com");
        getElement(mobileNumberTxtBx).sendKeys("0512345678");
    }
    public void clickNext(){
        forceClickOnElement(getElement(nextBTN));
    }
}

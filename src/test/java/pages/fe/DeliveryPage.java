package pages.fe;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.actions.ElementActions;

public class DeliveryPage extends ElementActions {


    By firstNameTxtBx=By.id("mat-input-6");
    By lastNameTxtBx=By.id("mat-input-7");
    By cityDropdown=By.id("mat-input-8");
    By abhaOpt=By.id("mat-option-48");
    By districtDropDown=By.id("mat-input-9");
    By  abhaAlJadidahOpt =By.xpath("//span[text()=' Abha Al Jadidah ']");
    By streetTxtBx=By.id("mat-input-10");
    By mobileNumberTxtBx=By.id("mat-input-12");
    By emailTxtBx=By.id("mat-input-11");
    By defaultAddressCHKBX=By.id("mat-checkbox-2-input");
    By loadingSpinner=By.xpath("//ngb-modal-window[contains(@role,'dialog')]");
    By nextBTN=By.xpath("//button[contains(@class,'mat-focus-indicator close-modal next-btn btn-rounded mat-raised-button mat-button-base mat-primary enableBtn')]");
    public void fillData(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingSpinner));
        getElement(firstNameTxtBx).sendKeys("Test");
        getElement(lastNameTxtBx).sendKeys("Test");
        getElement(cityDropdown).sendKeys("Abha");
        forceClickOnElement(getElement(abhaOpt));
        getElement(districtDropDown).sendKeys("Abha");
        forceClickOnElement(getElement(abhaAlJadidahOpt));
        getElement(streetTxtBx).sendKeys("hello world");
        getElement(mobileNumberTxtBx).sendKeys("0512345678");
        getElement(emailTxtBx).sendKeys("test@test.com");
        forceClickOnElement(getElement(defaultAddressCHKBX));

    }

    public void clickNext(){
        forceClickOnElement(getElementByIndex(nextBTN,0));
    }
}

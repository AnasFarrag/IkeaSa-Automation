package pages.fe;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Assertions;
import utilities.Paths;
import utilities.actions.ElementActions;
import utilities.readers.JsonTestDataReader;

import java.util.Arrays;

public class DeliveryPage extends ElementActions {
    Assertions assertions = new Assertions();
    JSONObject creditCardData = (JSONObject) JsonTestDataReader.parseJson(Paths.creditCardPath).get("creditCardDetails");
    JSONObject deliveryAddressData = (JSONObject) JsonTestDataReader.parseJson(Paths.deliveryAddressPath).get("deliveryAddress");
    // Locators
    By firstNameTxtBx = By.id("mat-input-6");
    By lastNameTxtBx = By.id("mat-input-7");
    By cityDropdown = By.id("mat-input-8");
    By abhaOpt = By.xpath("//span[text()=' Abha ']");
    By districtDropDown = By.id("mat-input-9");
    By abhaAlJadidahOpt = By.xpath("//span[text()=' Abha Al Jadidah ']");
    By streetTxtBx = By.id("mat-input-10");
    By mobileNumberTxtBx = By.id("mat-input-12");
    By emailTxtBx = By.id("mat-input-11");
    By defaultAddressCHKBX = By.id("mat-checkbox-2-input");
    By loadingSpinner = By.xpath("//ngb-modal-window[contains(@role,'dialog')]");
    By nextToCheckout = By.xpath("(//button[@id = 'save'])[1]");
    By creditCardButton = By.xpath("//*[@class = 'credit-card-title mb-0']");
    By cardNumber = By.id("card_number");
    By NameOnTheCard = By.id("card_holder_name");
    By expiryMonthDropdown = By.id("dropdownBasic11");
    By expiryMonth = By.id("month_4");
    By expiryYearDropdown = By.id("dropdownBasic2");
    By expiryYear = By.id("year_1");
    By CVV = By.id("card_security_code");
    By PayNowButton = By.xpath("//button[@class= 'proceed pay--button mat-raised-button btn-bold enableBtn']");
    By successIcon = By.xpath("//*[@class = 'image mb-4']");
    By confirmationNumber = By.xpath("//*[@class = 'confirm-number mb-0']");

//    -----------------------------------------------------------------------------------

    public void fillData() {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingSpinner));
        } catch (Exception ignored) {
        }
        try {
            String firstname = deliveryAddressData.get("firstName").toString();
            getElement(firstNameTxtBx).sendKeys(firstname);

            String lastName = deliveryAddressData.get("lastName").toString();
            getElement(lastNameTxtBx).sendKeys(lastName);

            String city = deliveryAddressData.get("city").toString();
            getElement(cityDropdown).sendKeys(city);

            forceClickOnElement(getElement(abhaOpt));
            String district = deliveryAddressData.get("district").toString();
            getElement(districtDropDown).sendKeys(district);
            forceClickOnElement(getElement(abhaAlJadidahOpt));

            String streetName = deliveryAddressData.get("streetName").toString();
            getElement(streetTxtBx).sendKeys(streetName);

            String mobileNumber = deliveryAddressData.get("mobileNumber").toString();
            getElement(mobileNumberTxtBx).sendKeys(mobileNumber);

            String email = deliveryAddressData.get("email").toString();
            getElement(emailTxtBx).sendKeys(email);
            forceClickOnElement(getElement(defaultAddressCHKBX));
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public void clickNext() {
        forceClickOnElement(getElement(nextToCheckout));
    }

    public void clickNextToCheckout() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(nextToCheckout));
        } catch (Exception ignored) {
        }
        forceClickOnElement(getElement(nextToCheckout));
    }

    public void clickOnCreditDebitCard() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingSpinner));
        wait.until(ExpectedConditions.visibilityOfElementLocated(creditCardButton));
        Thread.sleep(5000);
        forceClickOnElement(getElement(creditCardButton));
    }

    public void fillTheCreditCardData() {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingSpinner));
        } catch (Exception ignored) {
        }

        getElement(cardNumber).sendKeys(creditCardData.get("number").toString());
        getElement(NameOnTheCard).sendKeys(creditCardData.get("name").toString());
        forceClickOnElement(getElement(expiryMonthDropdown));
        scrollPageToElement(getElement(expiryMonth));
        forceClickOnElement(getElement(expiryMonth));
        forceClickOnElement(getElement(expiryYearDropdown));
        forceClickOnElement(getElement(expiryYear));
        getElement(CVV).sendKeys(creditCardData.get("ccv").toString());
    }

    public void clickOnPayNowButton() {
        forceClickOnElement(getElement(PayNowButton));
    }

    public void assertSuccessIcon() {
        try {
            Thread.sleep(15000);
        } catch (Exception ignored) {
        }
        assertions.assertElementExist(successIcon);
    }

    public void assertConfirmationNumberExists() {
        assertions.assertElementExist(confirmationNumber);
    }


}

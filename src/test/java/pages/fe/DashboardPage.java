package pages.fe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.actions.BrowserActions;
import utilities.actions.ElementActions;


public class DashboardPage extends ElementActions {




   By addToCartBTN=By.xpath("//button[contains(@aria-label, 'Add to bag, NEIDEN, Bed frame')]");

   public void goToHomePage(){
      getDriver().navigate().to(getEnvironmentURL());
    //acceptDisclaimer();
   }

   public void addProductToCart(){

   forceClickOnElement(getElement(addToCartBTN));
   }


}
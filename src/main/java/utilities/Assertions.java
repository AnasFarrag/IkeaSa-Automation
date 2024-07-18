package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.actions.ElementActions;

import static org.testng.Assert.*;

public class Assertions extends ElementActions{
    //================================Assertions By locator============================
    //=================================Assert on existence of element=====================
    public void assertElementExist(By locator) {
        assert getElement(locator).isDisplayed();
    }
}

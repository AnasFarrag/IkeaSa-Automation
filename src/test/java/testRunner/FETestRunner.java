package testRunner;

import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions(features = {"src/test/java/features/fe"}
        ,glue = {"stepDefinition","pages/fe", "utilities"}
        ,tags = ("@addToCart")
        ,plugin = {"pretty","html:test-output/DefaultReport/DefaultReport.html"
        ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)
public class FETestRunner extends TestBase {
}
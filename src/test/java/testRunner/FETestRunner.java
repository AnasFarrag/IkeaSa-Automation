package testRunner;

import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions(features = {"src/test/java/features/fe"}
        ,glue = {"stepDefinition","pages/fe", "utilities"}
        ,tags = ("@addToCart") //( @FESignInFailure and not @STOnly and not @RunOnce and not @IEOnly")
        ,plugin = {"pretty","html:test-output/DefaultReport/DefaultReport.html"
//      ,"json:test-output/jsonReport/jsonReport.json"
        //,"junit:test-output/junitReport/xmlReport.xml"
        //,"com.cucumber.listener.ExtentCucumberFormatter:"
        ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)
public class FETestRunner extends TestBase {
}
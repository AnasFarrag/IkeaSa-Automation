package testRunner;

import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions(features = {"src/test/java/features/fe"}
        ,glue = {"stepDefinition/fe","pages/fe", "utilities"}
        ,tags = ("@FERegression and not @SITOnly and not @RunOnce") //("@THOR-24 or @THOR-25 and @THOR-48 and not @FESignInFailure and not @STOnly and not @RunOnce and not @IEOnly")
        ,plugin = {"pretty","html:test-output/DefaultReport/DefaultReport.html"
//      ,"json:test-output/jsonReport/jsonReport.json"
        //,"junit:test-output/junitReport/xmlReport.xml"
        //,"com.cucumber.listener.ExtentCucumberFormatter:"
        ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)
public class FETestRunner extends TestBase {
}
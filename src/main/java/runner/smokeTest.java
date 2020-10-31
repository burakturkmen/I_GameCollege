package runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(

        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // to generate a extend report we need this plugin
        },

        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false,
        tags = {"@SmokeTest"}
)




public class smokeTest extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void afterClass() {

        Reporter.loadXMLConfig("src/main/java/XmlFiles/Extend_Report_Set.xml");//ayarlar alındı cucumber extend reporttan haberi oldu

        Reporter.setSystemInfo("QA Tester :  ", "Burak Türkmen");
        Reporter.setSystemInfo("Application name : ", "International Game Collage   ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}
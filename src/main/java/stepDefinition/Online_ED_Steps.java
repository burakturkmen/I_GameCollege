package stepDefinition;

import PageObjectModel.OnlineED_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Online_ED_Steps {
    private WebDriver driver;

    OnlineED_Page onlineED_page = new OnlineED_Page();

    @Given("^Navigate to website \\(Online ED\\)$")
    public void navigateToWebsiteOnlineED() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://igamecollege.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^Over hover to Life in College \\(Online ED\\)$")
    public void overHoverToLifeInCollegeOnlineED() {
        onlineED_page.overHoverLifeInCollegeButton();
    }

    @When("^click Online ED button$")
    public void click_Online_ED_button(){
        onlineED_page.clickToOnlineED();
    }

    @Then("^verify ONLINE ED text$")
    public void verify_ONLINE_ED_text(){
        onlineED_page.verifyOnlineEDtext();
    }

    @Then("^verify Online ED Page's url$")
    public void verifyOnlineEDPageSUrl() {
        onlineED_page.urlAssert();
    }
}

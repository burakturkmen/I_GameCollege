package stepDefinition;

import PageObjectModel.Excursions_Page;
import PageObjectModel.GameJam_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Excursions_Steps {

    private WebDriver driver;

    Excursions_Page excursions_page = new Excursions_Page();

    @Given("^Navigate to website \\(Excursions\\)$")
    public void navigateToWebsiteExcursions() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://igamecollege.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^over Hover to Life in College \\(Excursions\\)$")
    public void overHoverToLifeInCollegeExcursions() {
        excursions_page.overHoverLifeInCollegeButton();
    }

    @When("^click Excursions button$")
    public void click_Excursions_button() {
        excursions_page.clickToExcursions();
    }

    @Then("^verify Excursions text$")
    public void verify_Excursions_text() {
        excursions_page.verifyExcursionsText();
    }

    @Then("^Verify Excursions Page's Url$")
    public void verifyExcursionsPageSUrl() {
        excursions_page.urlAssert();
    }

}

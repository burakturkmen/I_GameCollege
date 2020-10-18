package stepDefinition;

import PageObjectModel.SocialActivities_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class SocialActivities_Steps {
    private WebDriver driver;

    SocialActivities_Page socialActivities_page = new SocialActivities_Page();

    @Given("^Navigate to website \\(Social Activities\\)$")
    public void navigateToWebsiteSocialActivities() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://igamecollege.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^Over hover to Life in Collage \\(Social Activities\\)$")
    public void overHoverToLifeInCollageSocialActivities() {
        socialActivities_page.overHoverLifeInCollegeButton();
    }

    @When("^Click to Social Activities$")
    public void click_to_Social_Activities(){
        socialActivities_page.clickToSocialActivities();
    }

    @Then("^verify SOCIAL ACTIVITIES text$")
    public void verify_SOCIAL_ACTIVITIES_text(){
        socialActivities_page.verifySocialActivities();
    }

    @Then("^verify Social Activities Page's url$")
    public void verifySocialActivitiesPageSUrl() {
        socialActivities_page.urlAssert();
    }

}

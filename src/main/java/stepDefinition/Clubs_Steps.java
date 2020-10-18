package stepDefinition;

import PageObjectModel.Clubs_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Clubs_Steps {

    private WebDriver driver;

    Clubs_Page clubs_page = new Clubs_Page();

    @Given("^Navigate to website \\(Clubs\\)$")
    public void navigateToWebsiteClubs() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://igamecollege.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @And("^Over hover to life in College \\(Clubs\\)$")
    public void overHoverToLifeInCollegeClubs() {
        clubs_page.overHoverLifeInCollegeButton();
    }

    @When("^Click to Clubs Button$")
    public void click_to_Clubs_Button() {
        clubs_page.clickToClubsButton();
    }

    @Then("^Verify Clubs Text$")
    public void verify_Clubs_Text()  {
        clubs_page.verifyClubsText();
    }

    @Then("^Verify Clubs Page's url$")
    public void verifyClubsPageSUrl() {
        clubs_page.urlAssertClubs();
    }

    @Then("^Click to Social Media Club$")
    public void click_to_Social_Media_Club() {
        clubs_page.clickToSocialMediaClub();
    }

    @Then("^Verify Social Media Club text$")
    public void verify_Social_Media_Club_text() {
        clubs_page.verifySocialMediaClubText();
    }

    @When("^click to Game Art Club$")
    public void click_to_Game_Art_Club() {
        clubs_page.clickGameArtClub();
    }
    @And("^Verify Game art Club text$")
    public void verifyGameArtClubText() {
        clubs_page.verifyGameArtClub();
    }

    @When("^Click to Game Marketing Club$")
    public void click_to_Game_Marketing_Club() {
        clubs_page.clickGameMarketingClub();
    }

    @When("^Verify Game Marketing Club text$")
    public void verify_Game_Marketing_Club_text() {
        clubs_page.verifyGameMarketingClub();
    }

    @When("^Click to Game College Magazine Club$")
    public void click_to_Game_College_Magazine_Club() {
        clubs_page.clickToGameCollegeMagazineClub();
    }

    @When("^Verify Game College Magazine Club text$")
    public void verify_Game_College_Magazine_Club_text() {
        clubs_page.verifyGameCollegeMagazineClub();
    }

    @When("^Click to Game Networking Club$")
    public void click_to_Game_Networking_Club() {
        clubs_page.clickToGameNetworkingClub();
    }

    @When("^Verify Game Networking Club text$")
    public void verify_Game_Networking_Club_text() {
        clubs_page.verifyGameNetworkingClub();
    }



}

package stepDefinition;

import PageObjectModel.GameJam_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class GameJam_Steps {
    private WebDriver driver;

    GameJam_Page gameJam_page = new GameJam_Page();

    @Given("^Navigate to website \\(GameJam\\)$")
    public void navigateToWebsiteGameJam() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://igamecollege.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^Over hover to Life in College \\(GameJam\\)$")
    public void overHoverToLifeInCollegeGameJam() {
        gameJam_page.overHoverLifeInCollegeButton();
    }

    @When("^Click to GameJam$")
    public void click_to_GameJam() {
        gameJam_page.clickToGameJam();
    }

    @Then("^verify GameJams text$")
    public void verify_GameJams_text() {
        gameJam_page.verify_gameJam_text();
    }

    @Then("^verify GameJam Page's URL$")
    public void verifyGameJamPageSURL() {
        gameJam_page.urlAssert();
    }



}

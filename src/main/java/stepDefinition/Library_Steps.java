package stepDefinition;

import PageObjectModel.Library_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Library_Steps {

    private WebDriver driver;

    Library_Page library_page = new Library_Page();


    @Given("^Navigate to website \\(Library\\)$")
    public void navigateToWebsiteLibrary() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://igamecollege.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^Over hover to Life in College \\(Library\\)$")
    public void overHoverToLifeInCollegeLibrary() {
        library_page.overHoverLifeInCollegeButton();
    }

    @When("^click Library button$")
    public void click_Library_button() {
        library_page.clickToLibrary();
    }

    @Then("^verify Library Text$")
    public void verify_Library_Text() {
        library_page.verifyLibraryText();
    }

    @Then("^verify Library Page's url$")
    public void verifyLibraryPageSUrl() {
        library_page.urlAssert();
    }
}

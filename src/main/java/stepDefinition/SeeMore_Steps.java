package stepDefinition;

import PageObjectModel.SeeMore_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class SeeMore_Steps {
    private WebDriver driver;

    SeeMore_Page seeMore_page = new SeeMore_Page();

    @Given("^Navigate to website \\(See More\\)$")
    public void navigate_to_website_See_More() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://igamecollege.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("^Over hover to Contact$")
    public void over_hover_to_Contact() {
        seeMore_page.overHoverContactMenu();
    }

    @When("^Click to See More button$")
    public void click_to_See_More_button(){
        seeMore_page.clickToSeeMore();
    }

    @Then("^Verify About Us text$")
    public void verify_About_Us_text(){
        seeMore_page.verifyAboutUsText();
    }

    @Then("^Verify About Us Page's Url$")
    public void verify_About_Us_Page_s_Url(){
        seeMore_page.URLAssertion("https://igamecollege.com/corporate/about-us/");
    }

}

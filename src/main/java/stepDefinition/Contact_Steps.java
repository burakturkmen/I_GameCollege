package stepDefinition;

import PageObjectModel.Contact_Page;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Contact_Steps {
    private WebDriver driver;

    Contact_Page contact_page = new Contact_Page();


    @Given("^Navigate to website \\(Contact\\)$")
    public void navigate_to_website_Contact() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://igamecollege.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Given("^Over hover to Contact \\(Contact\\)$")
    public void over_hover_to_Contact_Contact() {
        contact_page.overHoverContactMenu();
    }

    @When("^Click to Contact Button$")
    public void click_to_Contact_Button() {
        contact_page.clickToContactButton();
    }

    @Then("^Verify Contact Text$")
    public void verify_Contact_Text() {
        contact_page.verifyContactText();
    }

    @Then("^Verify Phone Number$")
    public void verify_Phone_Number() {
        contact_page.verifyPhoneNumber();
    }

    @Then("^Verify Founder Member's Name$")
    public void verify_Founder_Member_s_Name() {
        contact_page.verifyFounderMemberName();
    }

    @Then("^Verify Contact Us! text$")
    public void verify_Contact_Us_text() throws Throwable {
        contact_page.verifyContactUsText();
    }

    @When("^Fill the form boxes$")
    public void fill_the_form_boxes(DataTable table) throws Throwable {

        List<List<String>> data = table.raw();
        System.out.println(data.get(1).get(1));

        driver.findElement(By.xpath("//input[@name='your-name']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys(data.get(2).get(1));
        driver.findElement(By.xpath("//input[@name='your-subject']")).sendKeys(data.get(3).get(1));
        driver.findElement(By.xpath("//textarea[@name='your-message']")).sendKeys(data.get(4).get(1));
    }

    @Then("^Click to Submit Button$")
    public void click_to_Submit_Button() throws Throwable {
        contact_page.clickToSubmitButton();

    }

    @Then("^Verify Success Message$")
    public void verifySuccessMessage() {
        contact_page.verifySuccessMessage();
    }
}

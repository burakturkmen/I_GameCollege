package PageObjectModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Library_Page extends Abstract{

    WebDriver driver;
    public Library_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Life in College butonunun üstüne gelme
    @FindBy(xpath = "(//a[text()='Life in College'])[2]")
    private WebElement lifeInCollegeButton;

    public void overHoverLifeInCollegeButton(){
        actionsMethod(lifeInCollegeButton);
    }
    //Library buttonuna tıklama
    @FindBy(xpath = "(//a[@class='wh-content-box-link'])[15]")
    private WebElement LibraryButton;

    public void clickToLibrary(){
        clickFunction(LibraryButton);
    }

    //Library sayfasındaki Library yazısını doğrula
    @FindBy(xpath = "//span[contains(text(),'Library')]")
    private WebElement LibraryText;

    public void verifyLibraryText(){
        Assertion(LibraryText, "Library");
    }

    //Url doğrulama
    public void urlAssert(){
        URLAssertion("https://igamecollege.com/life-in-college/library/");
    }












}

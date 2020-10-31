package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Contact_Page extends Abstract {

    WebDriver driver;
    public Contact_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    //Contact Menusunun ustune gelme
    @FindBy(xpath = "//li[@id='menu-item-325']")
    private WebElement ContactMenu;

    public void overHoverContactMenu(){
        actionsMethod(ContactMenu);
    }
    //See More buttonuna tıkla
    @FindBy(xpath = "(//a[contains(text(),'Contact')])[3]")
    private WebElement ContactButton;

    public void clickToContactButton(){
        clickFunction(ContactButton);
    }
    //Contact yazısını doğrula
    @FindBy(xpath = "//span[contains(text(),'Contact')]")
    private WebElement ContactText;

    public void verifyContactText(){
        Assertion(ContactText, "Contact");
    }

    //Telefon numarasını doğrula
    @FindBy(xpath = "//h2[contains(text(),'+41 44 829 34 34')]")
    private WebElement PhoneNumber;

    public void verifyPhoneNumber(){
        Assertion(PhoneNumber, "+41 44 829 34 34" );
    }

    //Founder Member'ın ismini doğrula
     @FindBy(xpath = "//h6[contains(text(),'Tuncay Sevindik')]")
    private WebElement FounderMemberName;

    public void verifyFounderMemberName(){
        Assertion(FounderMemberName, "Tuncay Sevindik");
    }

    //Contact Us! text doğrulama
    @FindBy(xpath = "//h2[contains(text(),'Contact Us!')]")
    private WebElement ContactUsText;

    public void verifyContactUsText(){
        Assertion(ContactText, "Contact");
    }

    //Submit buttonuna tıkla
    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement SubmitButton;

    public void clickToSubmitButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        clickFunction(SubmitButton);
    }

    @FindBy(xpath = "//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok']")
    private WebElement successText;

    public void verifySuccessMessage(){
        Assertion(successText, "Thank you for your message. It has been sent.");
    }




}

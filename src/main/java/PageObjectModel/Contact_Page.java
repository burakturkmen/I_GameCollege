package PageObjectModel;

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

    @FindBy(xpath = "//h2[contains(text(),'Contact Us!')]")
    private WebElement ContactUsText;

    public void verifyContactUsText(){
        Assertion(ContactText, "Contact");
    }






}

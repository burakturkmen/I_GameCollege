package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SeeMore_Page extends Abstract{


    WebDriver driver;
    public SeeMore_Page(){
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
    @FindBy(xpath = "(//a[contains(text(),'See More')])[2]")
    private WebElement SeeMoreButton;

    public void clickToSeeMore(){
        clickFunction(SeeMoreButton);
    }
    //ABOUT US yazısını doğrula
    @FindBy(xpath = "//h1[contains(text(),'ABOUT US')]")
    private WebElement AboutUsText;

    public  void verifyAboutUsText(){
        Assertion(AboutUsText, "ABOUT US");
    }



}

package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Excursions_Page extends Abstract{

    WebDriver driver;
    public Excursions_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Life in College butonunun üstüne gelme
    @FindBy(xpath = "(//a[text()='Life in College'])[2]")
    private WebElement lifeInCollegeButton;

    public void overHoverLifeInCollegeButton(){
        actionsMethod(lifeInCollegeButton);
    }

    //Excursions buttonuna tıklama
    @FindBy(xpath = "(//a[@class='wh-content-box-link'])[13]")
    private WebElement ExcursionsButton;

    public void clickToExcursions(){
        clickFunction(ExcursionsButton);
    }

    //Excursions sayfasındaki Excursions yazısını doğrula
    @FindBy(xpath = "//span[contains(text(),'Excursions')]")
    private WebElement Excursions_text;

    public void verifyExcursionsText(){
        Assertion(Excursions_text, "Excursions");
    }

    //Url doğrulama
    public void urlAssert(){
        URLAssertion("https://igamecollege.com/life-in-college/excursions/");
    }

}

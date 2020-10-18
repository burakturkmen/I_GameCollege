package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SocialActivities_Page extends Abstract{

    WebDriver driver;
    public SocialActivities_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Life in College butonunun üstüne gelme
    @FindBy(xpath = "(//a[text()='Life in College'])[2]")
    private WebElement lifeInCollegeButton;

    public void overHoverLifeInCollegeButton(){
        actionsMethod(lifeInCollegeButton);
    }
    //Online ED buttonuna tıklama
    @FindBy(xpath = "(//a[@class='wh-content-box-link'])[11]")
    private WebElement SocialActivitiesButton;

    public void clickToSocialActivities(){
        clickFunction(SocialActivitiesButton);
    }

    //Social Activities sayfasındaki Social Activities yazısını doğrula
    @FindBy(xpath = "//span[contains(text(),'Social Activities')]")
    private WebElement socialActivities_text;

    public void verifySocialActivities(){
        Assertion(socialActivities_text, "Social Activities");
    }

    //url doğrulama
    public void urlAssert(){
        URLAssertion("https://igamecollege.com/life-in-college/social-activities/");
    }


}

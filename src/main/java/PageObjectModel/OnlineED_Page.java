package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OnlineED_Page extends Abstract{

    WebDriver driver;
    public OnlineED_Page(){
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
    @FindBy(xpath = "(//a[@class='wh-content-box-link'])[10]")
    private WebElement onlineED;

    public void clickToOnlineED(){
        clickFunction(onlineED);
    }

    //Online ED sayfasındaki ONLINE ED yazısını doğrulama
    @FindBy(xpath = "//h1[text()='ONLINE ED']")
    private WebElement onlineED_text;

    public void verifyOnlineEDtext(){
        Assertion(onlineED_text, "ONLINE ED");
    }

    //URL Doğrulama
    public void urlAssert(){
        URLAssertion("https://igamecollege.com/life-in-college/online-ed/");
    }

}
